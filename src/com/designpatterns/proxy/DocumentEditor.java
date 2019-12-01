package com.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {
    private List<Graphic> graphics = new ArrayList<>();

    public void addGraphic(Graphic graphic) {
        graphics.add(graphic);
    }

    public void open() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}
