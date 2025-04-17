package com.xworkz.internal;

public interface Pen {
    void write();
    void refill();
    void click();
    default void checkInkLevel() {
        System.out.println("Checking the ink level of the pen.");
    }

    default void displayBrand() {
        System.out.println("Displaying the brand name of the pen.");
    }
}
