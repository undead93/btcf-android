package com.bitcoinfinal.core.coins.families;

import com.bitcoinfinal.core.coins.CoinType;
import com.bitcoinfinal.core.wallet.AbstractAddress;
import com.bitcoinfinal.core.exceptions.AddressMalformedException;
import com.bitcoinfinal.core.wallet.families.bitcoin.BitAddress;

import org.bitcoinj.core.AddressFormatException;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
