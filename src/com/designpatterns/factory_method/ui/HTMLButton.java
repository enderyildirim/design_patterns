package com.designpatterns.factory_method.ui;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("HTML button rendering...");
    }

    @Override
    public void onClick() {
        System.out.println("HTML button clicked!");
    }
}
