package com.xworkz.internal;

public interface Flower {
    void bloom();
    void smell();
    void attractBees();

    default void displayColor() {
        System.out.println("The flower's color is beautiful.");
    }


}
