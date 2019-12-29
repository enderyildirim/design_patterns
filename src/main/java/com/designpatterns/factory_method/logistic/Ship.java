package com.designpatterns.factory_method.logistic;

public class Ship implements Transport {

    public Ship() {
        System.out.println("Ship is ready.");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a container.");
    }
}
