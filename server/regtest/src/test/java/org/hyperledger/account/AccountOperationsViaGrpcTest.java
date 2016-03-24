/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hyperledger.account;

import com.typesafe.config.ConfigFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.hyperledger.api.BCSAPI;
import org.hyperledger.common.*;
import org.hyperledger.test.GRPCRegtestRule;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.security.Security;

import static org.hyperledger.account.ActionWaiter.expected;
import static org.junit.Assert.assertEquals;

public class AccountOperationsViaGrpcTest {
    @BeforeClass
    public static void init() {
        Security.addProvider(new BouncyCastleProvider());
    }

    @ClassRule
    public static GRPCRegtestRule regtestRule = new GRPCRegtestRule(ConfigFactory.parseResources("test-config-grpc.json"));

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void sendToAddressTest() throws Exception {
        BCSAPI api = regtestRule.getBCSAPI();
        int startingChainHeight = api.getChainHeight();

        PrivateKey priv = PrivateKey.createNew();
        KeyListChain senderKeyChain = new KeyListChain(priv);
        BaseAccount senderAccount = new BaseAccount(senderKeyChain);
        api.registerTransactionListener(senderAccount);

        Transaction tx = Transaction.create()
                .inputs(TransactionInput.create().source(TID.INVALID, -1).build())
                .outputs(TransactionOutput.create().payTo(priv.getAddress()).value(100000000).build())
                .build();

        ActionWaiter.execute(() -> api.sendTransaction(tx), expected(senderAccount, 1));

        int newChainHeight = api.getChainHeight();
        assertEquals("No block was created", startingChainHeight + 1, newChainHeight);
        assertEquals("Incorrect balance", 100000000, senderAccount.getCoins().getTotalSatoshis());
    }
}
