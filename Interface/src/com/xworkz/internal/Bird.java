package com.xworkz.internal;

public interface Bird {
    void fly();
    void sing();
    void eat();

    default void chirp() {
        System.out.println("Bird is chirping.");
    }

    default void buildNest() {
        System.out.println("Bird is building a nest.");
    }
}
