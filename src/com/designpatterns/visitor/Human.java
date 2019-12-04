package com.designpatterns.visitor;

public class Human extends GameObject {

    public Human() {
        super(100);
    }

    @Override
    public void harm(int value) {
        super.harm(value);
        System.out.println("Human was harmed : -" +  value + ", Remaining hp : " + hp);
    }

    @Override
    public void hit(Weapon weapon) {
        weapon.doHarm(this);
    }

}
