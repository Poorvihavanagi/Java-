package com.xworkz.internal;

public interface Claypot {
    void heatUp();
    void cook();
    void coolDown();
    default void clean() {
        System.out.println("Cleaning the claypot after use.");
    }

    default void store() {
        System.out.println("Storing the claypot in a safe place.");
    }
}
