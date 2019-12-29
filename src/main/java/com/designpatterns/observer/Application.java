package com.designpatterns.observer;

public class Application {

    public static void main(String[] args) {
        Restaurant buzztime = new Restaurant("Buzztime");
        GroceryStore finerFoods = new GroceryStore("Finer Foods");
        Tailor tailor = new Tailor("Alex's True Cutting");

        buzztime.checkNewspaper();
        finerFoods.checkNewspaper();
        tailor.checkNewspaper();

        NewspaperDistributor newspaperDistributor = new NeighborhoodNewspaperDistributor();
        newspaperDistributor.subscribe(buzztime);
        newspaperDistributor.subscribe(finerFoods);
        newspaperDistributor.subscribe(tailor);

        newspaperDistributor.distributeNewspapers();

        newspaperDistributor.unsubscribe(finerFoods);
        newspaperDistributor.unsubscribe(tailor);
        newspaperDistributor.distributeNewspapers();

        buzztime.checkNewspaper();
        finerFoods.checkNewspaper();
        tailor.checkNewspaper();
    }

}
