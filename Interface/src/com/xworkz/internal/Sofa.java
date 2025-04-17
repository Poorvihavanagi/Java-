package com.xworkz.internal;

public interface Sofa {
    void sit();
    void fold();
    void move();
    default void clean() {
        System.out.println("Cleaning the sofa.");
    }
}
