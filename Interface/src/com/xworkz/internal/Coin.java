package com.xworkz.internal;

public interface Coin {
    void flip();
    void store();
    void exchange();

    default void clean() {
        System.out.println("Cleaning the coin.");
    }

    default void inspect() {
        System.out.println("Inspecting the coin for wear and tear.");
    }
}
