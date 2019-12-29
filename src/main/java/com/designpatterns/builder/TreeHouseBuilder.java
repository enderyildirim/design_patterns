package com.designpatterns.builder;

public class TreeHouseBuilder extends HouseBuilder {
    private int aboveGroundInMeters;

    @Override
    public void reset() {
        super.reset();
        aboveGroundInMeters = 0;
    }

    HouseBuilder setAboveGroundInMeters(int aboveGroundInMeters) {
        this.aboveGroundInMeters = aboveGroundInMeters;
        return this;
    }

    @Override
    TreeHouse build() {
        TreeHouse treeHouse = new TreeHouse();
        treeHouse.setAboveGroundInMeters(aboveGroundInMeters);
        treeHouse.setColor(color);
        treeHouse.setDoorCount(doorCount);
        treeHouse.setGardenSize(gardenSize);
        treeHouse.setWallCount(wallCount);
        treeHouse.setWindowsCount(windowsCount);
        return treeHouse;
    }

}
