package com.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle());
        shapes.add(new Circle());
        shapes.add(new ShapeAdapter(new Rectangle2D()));
        shapes.add(new ShapeAdapter(new Triangle2D()));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
