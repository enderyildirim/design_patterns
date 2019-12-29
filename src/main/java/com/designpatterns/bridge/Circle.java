package com.designpatterns.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color.getName() + " circle...");
    }

}
