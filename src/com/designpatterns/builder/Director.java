package com.designpatterns.builder;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructSmallHouse() {
        houseBuilder.color("brown");
        houseBuilder.walls("4");
        houseBuilder.garden("small");
        houseBuilder.windows("2");
        houseBuilder.doors("1");
        return houseBuilder.build();
    }

    public House constructBigHouse() {
        houseBuilder.color("grey");
        houseBuilder.walls("6");
        houseBuilder.garden("big");
        houseBuilder.windows("8");
        houseBuilder.doors("4");
        return houseBuilder.build();
    }
}
