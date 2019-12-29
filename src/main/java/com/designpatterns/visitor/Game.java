package com.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        List<GameObject> gameObjects = createRandomGameObjects();

        Ak47 ak47 = new Ak47();
        for (GameObject gameObject : gameObjects) {
            gameObject.hit(ak47);
        }

        MolotovCocktails molotovCocktails = new MolotovCocktails();
        for (GameObject gameObject : gameObjects) {
            gameObject.hit(molotovCocktails);
        }
    }

    private static List<GameObject> createRandomGameObjects() {
        Random random = new Random();
        List<GameObject> gameObjects = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5); i++) {
            gameObjects.add(new Cyborg());
        }
        for (int i = 0; i < random.nextInt(5); i++) {
            gameObjects.add(new Human());
        }
        for (int i = 0; i < random.nextInt(5); i++) {
            gameObjects.add(new Wall());
        }
        for (int i = 0; i < random.nextInt(5); i++) {
            gameObjects.add(new Machine());
        }
        return gameObjects;
    }

}
