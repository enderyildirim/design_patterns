package com.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class GraphicEditorMemento {
    private List<Shape> shapes = new ArrayList<>();

    public GraphicEditorMemento(List<Shape> shapes) {
        this.shapes = copyShapes(shapes);
    }

    private List<Shape> copyShapes(List<Shape> shapes) {
        List<Shape> copyShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            copyShapes.add(shape.copy());
        }
        return copyShapes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
