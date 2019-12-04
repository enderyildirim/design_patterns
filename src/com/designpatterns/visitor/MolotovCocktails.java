package com.designpatterns.visitor;

public class MolotovCocktails implements Weapon {

    @Override
    public void doHarm(Machine machine) {
        machine.harm(10);
    }

    @Override
    public void doHarm(Wall wall) {
        wall.harm(5);
    }

    @Override
    public void doHarm(Cyborg cyborg) {
        cyborg.harm(40);
    }

    @Override
    public void doHarm(Human human) {
        human.harm(50);
    }

}
