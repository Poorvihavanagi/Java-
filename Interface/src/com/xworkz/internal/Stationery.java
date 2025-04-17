package com.xworkz.internal;

public interface Stationery {
    void use();
    void keepInPouch();
    void share();

    default void clean() {
        System.out.println("Cleaning the stationery item.");
    }
}
