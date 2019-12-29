package com.designpatterns.builder;

import java.util.StringJoiner;

public class Castle extends House {
    private boolean hasDungeon;

    public boolean isHasDungeon() {
        return hasDungeon;
    }

    public void setHasDungeon(boolean hasDungeon) {
        this.hasDungeon = hasDungeon;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Castle.class.getSimpleName() + "[", "]")
                .add("windowsCount='" + getWindowsCount() + "'")
                .add("wallCount='" + getWallCount() + "'")
                .add("hasDungeon=" + hasDungeon)
                .add("gardenSize='" + getGardenSize() + "'")
                .add("doorCount='" + getDoorCount() + "'")
                .add("color='" + getColor() + "'")
                .toString();
    }
}
