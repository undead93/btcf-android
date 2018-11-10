package com.bitcoinfinal.core.messages;

import com.bitcoinfinal.core.wallet.AbstractTransaction;

import javax.annotation.Nullable;

/**
 * @author John L. Jegutanis
 */
public interface MessageFactory {
    int maxMessageSizeBytes();

    boolean canHandlePublicMessages();

    boolean canHandlePrivateMessages();

    TxMessage createPublicMessage(String message);

    @Nullable
    TxMessage extractPublicMessage(AbstractTransaction transaction);
}
