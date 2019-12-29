package com.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class MailNotifier implements Notifier {
    private List<String> mailAddresses = new ArrayList<>();

    public void addMailAddress(String mailAddress) {
        mailAddresses.add(mailAddress);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending mail message : " + message + ", to : " + mailAddresses);
    }
}
