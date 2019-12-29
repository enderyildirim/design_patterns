package com.designpatterns.memento;

import java.awt.*;
import java.util.Objects;

public abstract class BaseShape implements Shape {
    protected int x;
    protected int y;
    protected Color color;
    protected float stroke;

    public BaseShape(int x, int y, Color color, float stroke) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.stroke = stroke;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getStroke() {
        return stroke;
    }

    public void setStroke(float stroke) {
        this.stroke = stroke;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.setColor(color);
        graphics.setStroke(new BasicStroke(stroke));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseShape)) return false;

        BaseShape baseShape = (BaseShape) o;

        if (x != baseShape.x) return false;
        if (y != baseShape.y) return false;
        if (Float.compare(baseShape.stroke, stroke) != 0) return false;
        return Objects.equals(color, baseShape.color);
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (stroke != +0.0f ? Float.floatToIntBits(stroke) : 0);
        return result;
    }
}
