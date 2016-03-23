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

import org.hyperledger.common.*;

import java.util.List;
import java.util.Set;

public class OBCBlockStore implements BlockStore {
    @Override
    public List<ValidatedTransaction> getDescendants(List<TID> tids) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ValidatedTransaction> getSpendingTransactions(List<TID> tids) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void start() throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addGenesis(Block b) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void rejectedByPeer(String command, Hash hash, int code) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BID getSpvTop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public BID getFullTop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public StoredBlock getHighestBlock() throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public StoredHeader getHighestHeader() throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public StoredHeader getHeader(BID hash) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StoredBlock getBlock(BID hash) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasTransaction(TID hash) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValidatedTransaction getTransaction(TID hash) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public BID getTrunkBlockID(Transaction t) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BID> getMissingBlocks(int max) {
        throw new UnsupportedOperationException();
    }

    @Override
    public byte[] getMiscData(BID id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValidatedTransaction addTransaction(Transaction t) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public HeaderStoredInfo addHeader(Header b) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasBlock(BID h) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public BlockStoredInfo addBlock(Block block) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean validateBlock(Block block) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public ValidatedTransaction addClientTransaction(Transaction t) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public BlockStoredInfo addClientBlock(Block block) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addMiscData(BID id, byte[] data) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void standalonePruneBlock(BID id, int toHeight) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSpvHeight() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getFullHeight() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BID> getHeaderLocator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BID> catchUpHeaders(List<BID> inventory, int limit) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<BID> catchUpBlocks(List<BID> inventory, int limit) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<StoredTransaction> filterTransactions(Set<ByteVector> matchSet, MasterKey ek, int lookAhead) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ValidatedTransaction> getMempoolContent() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ValidatedTransaction> scanUnconfirmedPool(Set<ByteVector> matchSet) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<StoredTransaction> filterTransactions(Set<ByteVector> matchSet) throws HyperLedgerException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addBlockListener(BlockListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeBlockListener(BlockListener listener) {
        throw new UnsupportedOperationException();
    }
}
