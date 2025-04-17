package com.xworkz.internal;

public interface Tablet {
    void openApp();
    void swipe();
    void closeApp();
    default void restart() {
        System.out.println("Restarting the tablet.");
    }

    default void lockScreen() {
        System.out.println("Locking the tablet screen.");
    }
}
