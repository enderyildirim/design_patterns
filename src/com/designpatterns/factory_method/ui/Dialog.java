package com.designpatterns.factory_method.ui;

public abstract class Dialog {

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();
}
