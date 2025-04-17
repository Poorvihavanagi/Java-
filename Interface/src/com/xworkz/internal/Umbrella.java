package com.xworkz.internal;

public interface Umbrella {
    void open();
    void close();
    void protectFromRain();

    default void store() {
        System.out.println("Storing the umbrella after use.");
    }
    default void dry() {
        System.out.println("Drying the umbrella.");
    }
}
