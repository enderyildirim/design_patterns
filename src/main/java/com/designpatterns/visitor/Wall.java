package com.designpatterns.visitor;

public class Wall extends GameObject {

    public Wall() {
        super(750);
    }

    @Override
    public void harm(int value) {
        super.harm(value);
        System.out.println("Wall was harmed : -" +  value + ", Remaining hp : " + hp);
    }

    @Override
    public void hit(Weapon weapon) {
        weapon.doHarm(this);
    }

}
