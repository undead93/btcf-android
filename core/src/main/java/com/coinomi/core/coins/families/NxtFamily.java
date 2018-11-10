package com.bitcoinfinal.core.coins.families;

import com.bitcoinfinal.core.coins.CoinType;
import com.bitcoinfinal.core.exceptions.AddressMalformedException;
import com.bitcoinfinal.core.messages.MessageFactory;
import com.bitcoinfinal.core.wallet.AbstractAddress;
import com.bitcoinfinal.core.wallet.families.nxt.NxtAddress;
import com.bitcoinfinal.core.wallet.families.nxt.NxtTxMessage;

import javax.annotation.Nullable;


/**
 * @author John L. Jegutanis
 *
 * Coins that belong to this family are: NXT, Burst, etc
 */
public abstract class NxtFamily extends CoinType {
    public static final short DEFAULT_DEADLINE = 1440;

    {
        family = Families.NXT;
    }

    @Override
    public AbstractAddress newAddress(String addressStr) throws AddressMalformedException {
        return NxtAddress.fromString(this, addressStr);
    }

    @Override
    public boolean canHandleMessages() {
        return true;
    }

    @Override
    @Nullable
    public MessageFactory getMessagesFactory() {
        return NxtTxMessage.getFactory();
    }
}