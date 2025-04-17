package com.xworkz.internal;

public interface DeskLamp {
    void turnOn();
    void adjustBrightness();
    void turnOff();

    default void reset() {
        System.out.println("Resetting the desk lamp to default settings.");
    }

    default void store() {
        System.out.println("Storing the desk lamp safely.");
    }
}
