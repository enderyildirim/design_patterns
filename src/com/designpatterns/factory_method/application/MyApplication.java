package com.designpatterns.factory_method.application;

public class MyApplication extends Application {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
