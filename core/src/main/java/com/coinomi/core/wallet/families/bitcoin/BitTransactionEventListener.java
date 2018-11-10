package com.bitcoinfinal.core.wallet.families.bitcoin;

import com.bitcoinfinal.core.network.AddressStatus;
import com.bitcoinfinal.core.network.ServerClient.UnspentTx;
import com.bitcoinfinal.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
