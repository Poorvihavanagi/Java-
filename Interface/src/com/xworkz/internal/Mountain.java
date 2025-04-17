package com.xworkz.internal;

public interface Mountain {
    void provideScenery();
    void supportWildlife();
    void attractClimbers();
    default void provideFreshAir() {
        System.out.println("Providing fresh air at high altitudes.");
    }

    default void offerAdventure() {
        System.out.println("Offering an adventurous experience to climbers.");
    }
}
