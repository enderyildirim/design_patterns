package com.designpatterns.composite;

public class Application {

    public static void main(String[] args) {
        Box box = new Box();
        box.addItem(new HeadPhone());
        box.addItem(new Hammer());
        box.addItem(new Phone());
        Box innerBox = new Box();
        box.addItem(innerBox);
        innerBox.addItem(new Flashlight());
        innerBox.addItem(new Phone());

        System.out.println(box.price());
    }

}
