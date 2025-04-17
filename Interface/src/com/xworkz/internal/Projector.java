package com.xworkz.internal;

public interface Projector {
    void turnOn();
    void showPresentation();
    void turnOff();
    default void adjustBrightness() {
        System.out.println("Adjusting projector brightness.");
    }

    default void adjustVolume() {
        System.out.println("Adjusting projector volume.");
    }
}
