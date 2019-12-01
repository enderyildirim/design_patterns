package com.designpatterns.flyweight;

public class MovingParticle {
    private Particle particle;
    private Vector vector;
    private int speed;

    public MovingParticle(Particle particle, Vector vector, int speed) {
        this.particle = particle;
        this.vector = vector;
        this.speed = speed;
    }

    public Particle getParticle() {
        return particle;
    }

    public void setParticle(Particle particle) {
        this.particle = particle;
    }

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void draw() {

    }
}
