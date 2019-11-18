package com.designpatterns.factory_method.logistic;

public abstract class Logistics {

    public void planDelivery() {
        System.out.println("Planning delivery...");
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();

}
