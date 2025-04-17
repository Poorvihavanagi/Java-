package com.xworkz.internal;

public interface Bottle {
    void fill();
    void drink();
    void empty();
    default void clean() {
        System.out.println("Cleaning the bottle.");
    }

    default void store() {
        System.out.println("Storing the bottle after use.");
    }
}
