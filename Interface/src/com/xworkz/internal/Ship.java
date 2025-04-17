package com.xworkz.internal;

public interface Ship {
    void sail();
    void loadCargo();
    void dock();

    default void checkEngine() {
        System.out.println("Checking the engine status of the ship.");
    }

    default void soundHorn() {
        System.out.println("Sounding the ship's horn.");
    }
}
