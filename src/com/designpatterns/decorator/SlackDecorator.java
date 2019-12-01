package com.designpatterns.decorator;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.notifier.send(message);
        System.out.println("Sending slack message : " + message);
    }
}
