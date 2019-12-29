package com.designpatterns.observer;

public class Tailor implements Member {
    private String name;
    private boolean newspaperTaken;

    public Tailor(String name) {
        this.name = name;
    }

    @Override
    public void checkNewspaper() {
        if (newspaperTaken) {
            System.out.println(String.format("No need newspaper.(Tailor - %s)", name));
            return;
        }
        System.out.println(String.format("Didn't take any newspaper yet. (Tailor - %s)", name));
    }

    @Override
    public void takeNewspaper() {
        if (newspaperTaken) {
            System.out.println(String.format("Already took a newspaper (Tailor - %s)", name));
            return;
        }
        System.out.println(String.format("Hey look newspapers has arrived(Tailor - %s)", name));
        newspaperTaken = true;
    }

    @Override
    public boolean isNewspaperTaken() {
        return newspaperTaken;
    }
}
