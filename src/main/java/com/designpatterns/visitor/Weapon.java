package com.designpatterns.visitor;

public interface Weapon {

    void doHarm(Machine machine);

    void doHarm(Wall wall);

    void doHarm(Cyborg cyborg);

    void doHarm(Human human);

}
