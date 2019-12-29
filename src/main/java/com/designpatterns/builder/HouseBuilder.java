package com.designpatterns.builder;

public abstract class HouseBuilder {
    protected String wallCount;
    protected String doorCount;
    protected String windowsCount;
    protected String gardenSize;
    protected String color;

    public void reset() {
        wallCount = null;
        doorCount = null;
        windowsCount = null;
        gardenSize = null;
        color = null;
    }

    public HouseBuilder walls(String wallCount) {
        this.wallCount = wallCount;
        return this;
    }

    public HouseBuilder doors(String doorCount) {
        this.doorCount = doorCount;
        return this;
    }

    public HouseBuilder windows(String windowsCount) {
        this.windowsCount = windowsCount;
        return this;
    }

    public HouseBuilder garden(String gardenSize) {
        this.gardenSize = gardenSize;
        return this;
    }

    public HouseBuilder color(String color) {
        this.color = color;
        return this;
    }

    abstract House build();

}
