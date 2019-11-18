package com.designpatterns.factory_method.application;

public class ApplicationTest {

    public static void main(String[] args) {
        Application application = new MyApplication();
        application.openDocument();

        application = new AnotherApplication();
        application.openDocument();
    }

}
