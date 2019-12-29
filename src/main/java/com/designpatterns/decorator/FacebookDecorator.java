package com.designpatterns.decorator;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.notifier.send(message);
        System.out.println("Sending facebook message : " + message);
    }
}
