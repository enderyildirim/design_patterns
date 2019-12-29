package com.designpatterns.factory_method.application;

public class TextDocument implements Document {
    @Override
    public void open() {
        System.out.println("Text document is opened.");
    }

    @Override
    public void close() {
        System.out.println("Text document is closed.");
    }

    @Override
    public void save() {
        System.out.println("Saving text document...");
    }
}
