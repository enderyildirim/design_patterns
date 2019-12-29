package com.designpatterns.memento;

import java.awt.*;

public interface Shape {

    int getX();

    void setX(int x);

    int getY();

    void setY(int x);

    Color getColor();

    void setColor(Color color);

    float getStroke();

    void setStroke(float stroke);

    void draw(Graphics2D graphics);

    boolean contains(int x, int y);

    Shape copy();
}
