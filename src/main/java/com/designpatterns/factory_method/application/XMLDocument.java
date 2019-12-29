package com.designpatterns.factory_method.application;

public class XMLDocument implements Document {
    @Override
    public void open() {
        System.out.println("XML document is opened.");
    }

    @Override
    public void close() {
        System.out.println("XML document is closed.");
    }

    @Override
    public void save() {
        System.out.println("Saving XML document...");
    }
}
