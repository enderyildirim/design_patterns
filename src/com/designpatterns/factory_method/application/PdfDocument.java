package com.designpatterns.factory_method.application;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Pdf document is opened.");
    }

    @Override
    public void close() {
        System.out.println("Pdf document is closed.");
    }

    @Override
    public void save() {
        System.out.println("Saving pdf document...");
    }
}
