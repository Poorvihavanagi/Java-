package com.xworkz.internal;

public interface Comb {
    void untangleHair();
    void cleanComb();
    void keepInDrawer();

    default void sanitize() {
        System.out.println("Sanitizing the comb.");
    }

    default void display() {
        System.out.println("Displaying the comb in a stylish holder.");
    }
}
