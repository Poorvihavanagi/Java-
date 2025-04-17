package com.xworkz.internal;

public interface Tent {
    void setUp();
    void occupy();
    void packUp();

    default void cleanUp() {
        System.out.println("Cleaning up the camping tent after use.");
    }

    default void store() {
        System.out.println("Storing the camping tent in a safe place.");
    }
}
