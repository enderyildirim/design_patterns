package com.designpatterns.factory_method.logistic;

public class Client {

    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogictics();
        logistics.planDelivery();
    }

}
