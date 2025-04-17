package com.xworkz.internal;

public interface Shoe {
    void wear();
    void tieLaces();
    void remove();

    default void clean() {
        System.out.println("Cleaning the shoe.");
    }

    default void polish() {
        System.out.println("Polishing the shoe.");
    }
}
