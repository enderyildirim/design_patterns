package com.designpatterns.decorator;

public class SmsDecorator extends BaseDecorator {

    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.notifier.send(message);
        System.out.println("Sending sms message : " + message);
    }
}
