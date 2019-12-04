package com.designpatterns.visitor;

public class Ak47 implements Weapon {

    @Override
    public void doHarm(Machine machine) {
        machine.harm(100);
    }

    @Override
    public void doHarm(Wall wall) {
        wall.harm(200);
    }

    @Override
    public void doHarm(Cyborg cyborg) {
        cyborg.harm(150);
    }

    @Override
    public void doHarm(Human human) {
        human.harm(100);
    }
    
}
