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

package org.hyperledger.core;

import org.hyperledger.common.HyperLedgerException;
import org.hyperledger.common.TID;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class OBCBlockStoreTest {
    private BlockStore bs = new OBCBlockStore();

    @Test
    public void hasTransactionTest() throws HyperLedgerException {
        boolean result = bs.hasTransaction(TID.INVALID);
        assertTrue(result);
    }
}
