package com.designpatterns.proxy;

public class Client {

    public static void main(String[] args) {
        DocumentEditor documentEditor = new DocumentEditor();
        documentEditor.addGraphic(new Table(2, 2));
        documentEditor.addGraphic(new Table(3, 3));
        documentEditor.addGraphic(new ImageProxy(10, 10, "cat_img.jpg"));
//        documentEditor.open();
    }
}
