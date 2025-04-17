package com.xworkz.internal;

public interface Headphones {
    void playMusic();
    void pauseMusic();
    void increaseVolume();

    default void turnOn() {
        System.out.println("Headphones are turned on.");
    }
}
