package com.designpatterns.factory_method.logistic;

public class Truck implements Transport {

    public Truck() {
        System.out.println("Truck is ready.");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering by land in a box.");
    }
}
