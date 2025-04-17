package com.xworkz.internal;

public interface Game {
    void start();
    void play();
    void end();
    default void pause() {
        System.out.println("Pausing the game.");
    }
}
