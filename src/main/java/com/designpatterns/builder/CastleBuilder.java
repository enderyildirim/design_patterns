package com.designpatterns.builder;

public class CastleBuilder extends HouseBuilder {
    private boolean hasDungeon;

    @Override
    public void reset() {
        super.reset();
        hasDungeon = false;
    }

    public HouseBuilder setHasDungeon(boolean hasDungeon) {
        this.hasDungeon = hasDungeon;
        return this;
    }

    @Override
    public House build() {
        Castle castle = new Castle();
        castle.setHasDungeon(hasDungeon);
        castle.setColor(color);
        castle.setDoorCount(doorCount);
        castle.setGardenSize(gardenSize);
        castle.setWallCount(wallCount);
        castle.setWindowsCount(windowsCount);
        return castle;
    }
}
