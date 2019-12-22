package com.designpatterns.memento;

import java.awt.*;

public class Rectangle extends BaseShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(0, 0, Color.BLACK, 1.0f);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D graphics) {
        super.draw(graphics);
        graphics.drawRect(x, y, width, height);
    }

    @Override
    public boolean contains(int x, int y) {
        double x0 = getX();
        double y0 = getY();
        return (x >= x0 &&
                y >= y0 &&
                x < x0 + getWidth() &&
                y < y0 + getHeight());
    }

    @Override
    public Shape copy() {
        Rectangle rectangle = new Rectangle(this.width, this.height);
        rectangle.stroke = this.stroke;
        rectangle.color = this.color;
        rectangle.x = this.x;
        rectangle.y = this.y;
        return rectangle;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (width != rectangle.width) return false;
        return height == rectangle.height;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }
}
