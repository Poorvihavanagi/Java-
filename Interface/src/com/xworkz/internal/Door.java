package com.xworkz.internal;

public interface Door {
    void open();
    void close();
    void lock();
    default void paint() {
        System.out.println("Painting the door.");
    }

    default void clean() {
        System.out.println("Cleaning the door.");
    }
}
