package com.xworkz.internal;

public interface Cement {
    void mixWithWater();
    void pour();
    void dry();

    default void setTimer() {
        System.out.println("Setting timer for the cement to dry.");
    }

    default void checkConsistency() {
        System.out.println("Checking the consistency of the cement mixture.");
    }

}
