package com.xworkz.internal;

public interface Movie {
    void play();
    void pause();
    void stop();
    default void rewind() {
        System.out.println("Rewinding the movie.");
    }

    default void forward() {
        System.out.println("Fast forwarding the movie.");
    }
}
