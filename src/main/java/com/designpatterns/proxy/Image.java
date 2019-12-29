package com.designpatterns.proxy;

public class Image implements Graphic {
    private int height;
    private int width;

    public Image(int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("Creating image...");
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
        System.out.println("Drawing image...");
    }

}
