package com.xworkz.internal;

public interface Drone {
    void takeOff();
    void fly();
    void land();

    default void charge() {
        System.out.println("Charging the drone.");
    }

    default void hover() {
        System.out.println("Drone is hovering.");
    }
}
