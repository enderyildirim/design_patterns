package com.designpatterns.adapter.shape;

public class ShapeAdapter implements Shape {
    private GeometricObject geometricObject;

    public ShapeAdapter(GeometricObject geometricObject) {
        this.geometricObject = geometricObject;
    }

    @Override
    public void draw() {
        geometricObject.draw2D();
    }

}
