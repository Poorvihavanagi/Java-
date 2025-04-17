package com.xworkz.internal;

public interface Television {
    void switchOn();
    void switchOff();
    void changeChannel();

    default void adjustVolume() {
        System.out.println("Adjusting the volume of the TV.");
    }

    default void mute() {
        System.out.println("Muting the TV.");
    }
}
