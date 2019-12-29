package com.designpatterns.builder;

public class Application {

    public static void main(String[] args) {
        TreeHouseBuilder treeHouseBuilder = new TreeHouseBuilder();
        Director director = new Director(treeHouseBuilder);

        System.out.println(director.constructSmallHouse());
        System.out.println(director.constructBigHouse());

        director.setHouseBuilder(new CastleBuilder());
        System.out.println(director.constructSmallHouse());
        System.out.println(director.constructBigHouse());
    }

}
