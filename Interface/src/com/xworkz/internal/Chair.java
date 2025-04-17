package com.xworkz.internal;

public interface Chair {
    void sit();
    void adjustHeight();
    void rotate();

    default void clean() {
        System.out.println("Cleaning the chair.");
    }

    default void fold() {
        System.out.println("Folding the chair for storage.");
    }

}
