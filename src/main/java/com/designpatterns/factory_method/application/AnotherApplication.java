package com.designpatterns.factory_method.application;

public class AnotherApplication extends Application {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
