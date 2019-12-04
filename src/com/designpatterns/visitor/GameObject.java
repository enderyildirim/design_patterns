package com.designpatterns.visitor;

public abstract class GameObject {
    protected int hp;

    public GameObject(int hp) {
        this.hp = hp;
    }

    public void harm(int value) {
        hp = Math.max(0, hp - value);
    }

    public abstract void hit(Weapon weapon);

}
