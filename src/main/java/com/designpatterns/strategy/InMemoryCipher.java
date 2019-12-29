package com.designpatterns.strategy;

public class InMemoryCipher implements CipherStrategy {

    @Override
    public void performAction(String text) {
        System.out.println("Performing in memory cipher action...");
    }

}
