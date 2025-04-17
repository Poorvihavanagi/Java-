package com.xworkz.internal;

public interface Jam {
    void spread();
    void taste();
    void store();
    default void checkExpiry() {
        System.out.println("Checking the expiry date of the jam.");
    }
}
