package com.designpatterns.observer;

public class GroceryStore implements Member {
    private String name;
    private boolean newspaperTaken;

    public GroceryStore(String name) {
        this.name = name;
    }

    @Override
    public void checkNewspaper() {
        if (newspaperTaken) {
            System.out.println(String.format("No need newspaper.(GroceryStore - %s)", name));
            return;
        }
        System.out.println(String.format("Didn't take any newspaper yet. (GroceryStore - %s)", name));
    }

    @Override
    public void takeNewspaper() {
        if (newspaperTaken) {
            System.out.println(String.format("Already took a newspaper (GroceryStore - %s)", name));
            return;
        }
        System.out.println(String.format("Hey look newspapers has arrived(GroceryStore - %s)", name));
        newspaperTaken = true;
    }

    @Override
    public boolean isNewspaperTaken() {
        return newspaperTaken;
    }

}
