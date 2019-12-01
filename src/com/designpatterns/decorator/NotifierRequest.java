package com.designpatterns.decorator;

public class NotifierRequest {
    boolean facebookEnabled = true;
    boolean smsEnabled = true;
    boolean slackEnabled = true;

    public boolean isFacebookEnabled() {
        return facebookEnabled;
    }

    public void setFacebookEnabled(boolean facebookEnabled) {
        this.facebookEnabled = facebookEnabled;
    }

    public boolean isSmsEnabled() {
        return smsEnabled;
    }

    public void setSmsEnabled(boolean smsEnabled) {
        this.smsEnabled = smsEnabled;
    }

    public boolean isSlackEnabled() {
        return slackEnabled;
    }

    public void setSlackEnabled(boolean slackEnabled) {
        this.slackEnabled = slackEnabled;
    }
}
