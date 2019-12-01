package com.designpatterns.decorator;

public class Application {

    public static void main(String[] args) {
        NotifierRequest notifierRequest = new NotifierRequest();
        sendMessage(notifierRequest, "Alert!");

        notifierRequest.setFacebookEnabled(false);
        notifierRequest.setSlackEnabled(false);
        sendMessage(notifierRequest, "Hello!");
    }

    private static void sendMessage(NotifierRequest notifierRequest, String message) {
        Notifier stack = null;

        MailNotifier mailNotifier = new MailNotifier();
        mailNotifier.addMailAddress("abc@xyz.com");
        mailNotifier.addMailAddress("xyz@xyz.com");
        stack = mailNotifier;

        if (notifierRequest.isFacebookEnabled()) {
            stack = new FacebookDecorator(stack);
        }
        if (notifierRequest.isSlackEnabled()) {
            stack = new SlackDecorator(stack);
        }
        if (notifierRequest.isSmsEnabled()) {
            stack = new SmsDecorator(stack);
        }
        stack.send(message);
    }

}
