package com.goterl.lazysodium.interfaces;

public interface Core {

    interface Native {

        void cryptoCoreEd25519ScalarAdd(byte[] z, byte[] x, byte[] y);

        void cryptoCoreEd25519ScalarMul(byte[] z, byte[] x, byte[] y);

        void cryptoCoreEd25519ScalarReduce(byte[] r, byte[] s);

    }
}