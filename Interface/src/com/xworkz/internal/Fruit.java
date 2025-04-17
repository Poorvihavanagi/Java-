package com.xworkz.internal;

public interface Fruit {
    void peel();
    void eat();
    void store();
    default void dispose() {
        System.out.println("Disposing of the fruit.");
    }
}
