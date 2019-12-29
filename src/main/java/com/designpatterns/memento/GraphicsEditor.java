package com.designpatterns.memento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class GraphicsEditor extends JPanel {
    private Point dragStart;
    private Shape selectedShape;
    private List<Shape> shapes = new ArrayList<>();

    @Override
    public void paint(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw((Graphics2D) g);
        }
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public GraphicEditorMemento save() {
        return new GraphicEditorMemento(shapes);
    }

    public void restore(GraphicEditorMemento memento) {
        if (memento != null) {
            shapes = memento.getShapes();
            getRootPane().repaint();
        }
    }

    private void selectShapeContainsPoint(int x, int y) {
        for (Shape shape : shapes) {
            if (shape.contains(x, y)) {
                selectedShape = shape;
                selectedShape.setStroke(3.0f);
                dragStart = new Point(x - selectedShape.getX(), y - selectedShape.getY());
                getRootPane().repaint();
                return;
            }
        }
    }

    private void removeSelectedShape() {
        if (selectedShape != null) {
            selectedShape.setStroke(1.0f);
            dragStart = null;
            selectedShape = null;
            getRootPane().repaint();
        }
    }

    private void dragSelectedShape(int x, int y) {
        if (selectedShape != null) {
            selectedShape.setX(x - dragStart.getX());
            selectedShape.setY(y - dragStart.getY());
            getRootPane().repaint();
        }
    }

    public static class EditorMouseListener extends MouseAdapter {
        private GraphicsEditor graphicsEditor;

        public EditorMouseListener(GraphicsEditor graphicsEditor) {
            this.graphicsEditor = graphicsEditor;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            graphicsEditor.selectShapeContainsPoint(e.getX(), e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            graphicsEditor.removeSelectedShape();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            graphicsEditor.dragSelectedShape(e.getX(), e.getY());
        }

    }
}
