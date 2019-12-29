package com.designpatterns.flyweight;

import java.util.Random;

public class Application {

    public static final String[] colors = {"green", "yellow", "blue", "silver"};
    public static final int[] sizes = {10, 20, 30, 40, 50};

    public static Random random = new Random();

    public static void main(String[] args) {
        long particleCount = 10_000_000;

        Game game = new Game();
        for (int i = 0; i < particleCount; i++) {
            game.addParticle(getRandomColor(), getRandomParticleSize(), new Vector(random.nextInt(), random.nextInt()), random.nextInt(300));
        }
        game.draw();
    }

    public static String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }

    public static int getRandomParticleSize() {
        return sizes[random.nextInt(sizes.length)];
    }

}
