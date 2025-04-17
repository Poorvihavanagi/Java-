package com.xworkz.internal;

public interface Campfire {
    void ignite();
    void maintainFire();
    void extinguish();
    default void gatherWood() {
        System.out.println("Gathering wood for the campfire.");
    }

    default void lightTorch() {
        System.out.println("Lighting a torch to enhance the campfire ambiance.");
    }
}
