package com.designpatterns.proxy;

public class ImageProxy implements Graphic {
    private int height;
    private int width;
    private String imageFile;
    private Image image;

    public ImageProxy(int height, int width, String imageFile) {
        this.height = height;
        this.width = width;
        this.imageFile = imageFile;
    }

    @Override
    public int getHeight() {
        if (image != null) {
            return image.getHeight();
        }
        return height;
    }

    @Override
    public int getWidth() {
        if (image != null) {
            return image.getWidth();
        }
        return width;
    }

    @Override
    public void draw() {
        if (image == null) {
            loadImage();
        }
        image.draw();
    }

    private void loadImage() {
        System.out.println("Loading image from disk : " + imageFile);
        image = new Image(height, width);
    }
}
