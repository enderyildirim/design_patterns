package com.designpatterns.visitor;

public class Cyborg extends GameObject {

    public Cyborg() {
        super(5000);
    }

    @Override
    public void harm(int value) {
        super.harm(value);
        System.out.println("Cyborg was harmed : -" +  value + ", Remaining hp : " + hp);
    }

    @Override
    public void hit(Weapon weapon) {
        weapon.doHarm(this);
    }

}
