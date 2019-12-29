package com.designpatterns.builder;

import java.util.StringJoiner;

public class TreeHouse extends House {
    private int aboveGroundInMeters;

    public int getAboveGroundInMeters() {
        return aboveGroundInMeters;
    }

    public void setAboveGroundInMeters(int aboveGroundInMeters) {
        this.aboveGroundInMeters = aboveGroundInMeters;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TreeHouse.class.getSimpleName() + "[", "]")
                .add("windowsCount='" + getWindowsCount() + "'")
                .add("wallCount='" + getWallCount() + "'")
                .add("gardenSize='" + getGardenSize() + "'")
                .add("doorCount='" + getDoorCount() + "'")
                .add("color='" + getColor() + "'")
                .add("aboveGroundInMeters=" + aboveGroundInMeters)
                .toString();
    }
}
