package com.xworkz.internal;

public interface Music {
    void play();
    void pause();
    void stop();

    default void shuffle() {
        System.out.println("Shuffling the music playlist.");
    }

    default void repeat() {
        System.out.println("Repeating the current song.");
    }
}
