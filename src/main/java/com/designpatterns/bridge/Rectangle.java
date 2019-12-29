package com.designpatterns.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color.getName() + " rectangle...");
    }

}
