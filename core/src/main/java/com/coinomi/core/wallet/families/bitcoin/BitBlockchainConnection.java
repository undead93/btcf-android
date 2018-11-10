package com.bitcoinfinal.core.wallet.families.bitcoin;

import com.bitcoinfinal.core.network.AddressStatus;
import com.bitcoinfinal.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
