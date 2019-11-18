package com.designpatterns.factory_method.logistic;

public class LogisticsTest {

    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogictics();
        logistics.planDelivery();
    }

}
