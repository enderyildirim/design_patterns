package com.designpatterns.proxy;

public class Table implements Graphic {
    private int height;
    private int width;

    public Table(int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("Creating table...");
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing table...");
    }

}
