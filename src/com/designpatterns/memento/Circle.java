package com.designpatterns.memento;

import java.awt.*;

public class Circle extends BaseShape {
    private int radius;

    public Circle(int radius) {
        super(0, 0, Color.BLACK, 1.0f);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics2D graphics) {
        super.draw(graphics);
        graphics.drawOval(x, y, radius, radius);
    }

    @Override
    public boolean contains(int x, int y) {
        double ellw = radius;
        if (ellw <= 0.0) {
            return false;
        }
        double normx = (x - getX()) / ellw - 0.5;
        double ellh = radius;
        if (ellh <= 0.0) {
            return false;
        }
        double normy = (y - getY()) / ellh - 0.5;
        return (normx * normx + normy * normy) < 0.25;
    }

    @Override
    public Shape copy() {
        Circle circle = new Circle(this.radius);
        circle.stroke = this.stroke;
        circle.color = this.color;
        circle.x = this.x;
        circle.y = this.y;
        return circle;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
