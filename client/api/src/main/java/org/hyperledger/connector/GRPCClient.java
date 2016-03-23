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
package org.hyperledger.connector;

import java.util.List;
import java.util.Set;

import org.hyperledger.api.APIBlock;
import org.hyperledger.api.APIBlockIdList;
import org.hyperledger.api.APIHeader;
import org.hyperledger.api.APITransaction;
import org.hyperledger.api.AlertListener;
import org.hyperledger.api.BCSAPI;
import org.hyperledger.api.BCSAPIException;
import org.hyperledger.api.RejectListener;
import org.hyperledger.api.TransactionListener;
import org.hyperledger.api.TrunkListener;
import org.hyperledger.common.Address;
import org.hyperledger.common.BID;
import org.hyperledger.common.Block;
import org.hyperledger.common.MasterPublicKey;
import org.hyperledger.common.TID;
import org.hyperledger.common.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GRPCClient implements BCSAPI {
    private static final Logger log = LoggerFactory.getLogger(GRPCClient.class);

	@Override
	public String getClientVersion() throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServerVersion() throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long ping(long nonce) throws BCSAPIException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addAlertListener(AlertListener listener) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAlertListener(AlertListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getChainHeight() throws BCSAPIException {
		log.debug("getChainHeight");
		return 0;
	}

	@Override
	public APIBlockIdList getBlockIds(BID blockId, int count) throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public APIHeader getBlockHeader(BID hash) throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public APIBlock getBlock(BID hash) throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public APITransaction getTransaction(TID hash) throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<APITransaction> getInputTransactions(TID txId) throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendTransaction(Transaction transaction) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerRejectListener(RejectListener rejectListener) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRejectListener(RejectListener rejectListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public APIHeader mine(Address address) throws BCSAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendBlock(Block block) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerTransactionListener(TransactionListener listener) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTransactionListener(TransactionListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerTrunkListener(TrunkListener listener) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTrunkListener(TrunkListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void scanTransactionsForAddresses(Set<Address> addresses, TransactionListener listener)
			throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void scanTransactions(MasterPublicKey master, int lookAhead, TransactionListener listener)
			throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void catchUp(List<BID> inventory, int limit, boolean headers, TrunkListener listener)
			throws BCSAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public void spendingTransactions(List<TID> tids, TransactionListener listener) throws BCSAPIException {
		// TODO Auto-generated method stub

	}

}
