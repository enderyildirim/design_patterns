package com.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParticleFactory {
    private static Map<String, List<Particle>> particleCache = new HashMap<>();
    private static int particleCount = 0;


    public static Particle getParticle(String color, int size) {
        List<Particle> particles = particleCache.get(color);
        if (particles != null) {
            Particle particleBySize = findParticleBySize(particles, size);
            if (particleBySize != null) {
                return particleBySize;
            }
        }
        return createParticleAndAddToCache(color, size);
    }

    private static Particle createParticleAndAddToCache(String color, int size) {
        Particle particle = new Particle(color, size);
        List<Particle> particlesByColor = particleCache.get(color);
        if (particlesByColor != null) {
            particlesByColor.add(particle);
        } else {
            particlesByColor = new ArrayList<>();
            particlesByColor.add(particle);
            particleCache.put(color, particlesByColor);
        }
        System.out.println(String.format("Created new particle(%s)", ++particleCount));
        return particle;
    }

    private static Particle findParticleBySize(List<Particle> particles, int size) {
        for (Particle particle : particles) {
            if (particle.getSize() == size) {
                return particle;
            }
        }
        return null;
    }

}
