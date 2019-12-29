package com.designpatterns.builder;

import java.util.StringJoiner;

public abstract class House {
    private String wallCount;
    private String doorCount;
    private String windowsCount;
    private String gardenSize;
    private String color;

    public String getWallCount() {
        return wallCount;
    }

    public void setWallCount(String wallCount) {
        this.wallCount = wallCount;
    }

    public String getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(String doorCount) {
        this.doorCount = doorCount;
    }

    public String getWindowsCount() {
        return windowsCount;
    }

    public void setWindowsCount(String windowsCount) {
        this.windowsCount = windowsCount;
    }

    public String getGardenSize() {
        return gardenSize;
    }

    public void setGardenSize(String gardenSize) {
        this.gardenSize = gardenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", House.class.getSimpleName() + "[", "]")
                .add("windowsCount='" + windowsCount + "'")
                .add("wallCount='" + wallCount + "'")
                .add("gardenSize='" + gardenSize + "'")
                .add("doorCount='" + doorCount + "'")
                .add("color='" + color + "'")
                .toString();
    }
}
