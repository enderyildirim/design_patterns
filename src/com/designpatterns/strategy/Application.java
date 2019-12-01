package com.designpatterns.strategy;

public class Application {

    public static void main(String[] args) {
        Cipher cipher = new Cipher();
        cipher.setCipherStrategy(new InMemoryCipher());
        cipher.encrypt("123456");

        cipher.setCipherStrategy(new SwapToDiskCipher());
        cipher.encrypt("654321");
    }

}
