package com.designpatterns.observer;

public class Restaurant implements Member {
    private String name;
    private boolean newspaperTaken;

    public Restaurant(String name) {
        this.name = name;
    }

    @Override
    public void checkNewspaper() {
        if (newspaperTaken) {
            System.out.println(String.format("No need newspaper.(Restaurant - %s)", name));
            return;
        }
        System.out.println(String.format("Didn't take any newspaper yet. (Restaurant - %s)", name));
    }

    @Override
    public void takeNewspaper() {
        if (newspaperTaken) {
            System.out.println(String.format("Already took a newspaper (Restaurant - %s)", name));
            return;
        }
        System.out.println(String.format("Hey look newspapers has arrived(Restaurant - %s)", name));
        newspaperTaken = true;
    }

    @Override
    public boolean isNewspaperTaken() {
        return newspaperTaken;
    }

}
