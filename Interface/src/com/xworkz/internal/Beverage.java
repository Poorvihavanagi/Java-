package com.xworkz.internal;

public interface Beverage {
    void brew();
    void pour();
    void drink();

    default void addSugar() {
        System.out.println("Adding sugar to the beverage.");
    }

    default void addMilk() {
        System.out.println("Adding milk to the beverage.");
    }
}
