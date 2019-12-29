package com.designpatterns.factory_method.logistic;

public class SeaLogictics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
