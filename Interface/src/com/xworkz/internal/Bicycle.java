package com.xworkz.internal;

public interface Bicycle {
    void pedal();
    void brake();
    void changeGear();

    default void ringBell() {
        System.out.println("Ringing the bicycle bell.");
    }

    default void turnLightsOn() {
        System.out.println("Turning on the bicycle lights.");
    }
}
