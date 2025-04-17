package com.xworkz.internal;

public interface Suitcase {
    void packItems();
    void roll();
    void openSuitcase();

    default void lockSuitcase() {
        System.out.println("Locking the suitcase.");
    }

    default void unlockSuitcase() {
        System.out.println("Unlocking the suitcase.");
    }
}
