package com.bitcoinfinal.core.coins;

import com.bitcoinfinal.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class BitcoinFinalMain extends BitFamily {
    private BitcoinFinalMain() {
        id = "bitcoinfinal.main";

        addressHeader = 0;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 128;

        name = "BitcoinFinal";
        symbol = "BTCF";
        uriScheme = "bitcoinfinal";
        bip44Index = 99;
        unitExponent = 8;
        feeValue = value(12000);
        minNonDust = value(5460);
        softDustLimit = value(1000000); // 0.01 BTCF
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("BitcoinFinal Signed Message:\n");
    }

    private static BitcoinFinalMain instance = new BitcoinFinalMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
