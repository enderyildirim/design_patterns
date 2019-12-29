package com.designpatterns.strategy;

public class Cipher {
    private CipherStrategy cipherStrategy;

    public void setCipherStrategy(CipherStrategy cipherStrategy) {
        this.cipherStrategy = cipherStrategy;
    }

    public void encrypt(String text) {
        cipherStrategy.performAction(text);
    }

}
