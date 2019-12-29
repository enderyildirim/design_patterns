package com.designpatterns.visitor;

public class Machine extends GameObject {

    public Machine() {
        super(1000);
    }

    @Override
    public void harm(int value) {
        super.harm(value);
        System.out.println("Machine was harmed : -" +  value + ", Remaining hp : " + hp);
    }

    @Override
    public void hit(Weapon weapon) {
        weapon.doHarm(this);
    }

}
