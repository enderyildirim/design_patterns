package com.designpatterns.factory_method.ui;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows button rendering...");
    }

    @Override
    public void onClick() {
        System.out.println("Windows button clicked!");
    }
}
