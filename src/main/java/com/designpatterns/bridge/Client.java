package com.designpatterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(new Red()));
        shapes.add(new Rectangle(new Blue()));
        shapes.add(new Circle(new Yellow()));
        shapes.add(new Triangle(new Red()));
        shapes.add(new Triangle(new Yellow()));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
