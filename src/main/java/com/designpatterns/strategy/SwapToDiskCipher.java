package com.designpatterns.strategy;

public class SwapToDiskCipher implements CipherStrategy {

    @Override
    public void performAction(String text) {
        System.out.println("Performing swap to disk cipher action...");
    }

}
