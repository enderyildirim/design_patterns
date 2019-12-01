package com.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<MovingParticle> movingParticles = new ArrayList<>();

    public void addParticle(String color, int size, Vector vector, int speed) {
        Particle particle = ParticleFactory.getParticle(color, size);
        movingParticles.add(new MovingParticle(particle, vector, speed));
    }

    public void draw() {
        for (MovingParticle movingParticle : movingParticles) {
            movingParticle.draw();
        }
        System.out.println(String.format("%s moving particle were drawn.", movingParticles.size()));
    }

}
