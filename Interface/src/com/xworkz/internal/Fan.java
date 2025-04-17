package com.xworkz.internal;

public interface Fan {
    void turnOn();
    void turnOff();
    void changeSpeed();

    default void oscillate() {
        System.out.println("Fan is oscillating.");
    }

    default void displayStatus() {
        System.out.println("Fan is in a working state.");
    }
}
