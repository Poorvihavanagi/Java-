package com.xworkz.internal;

public interface Book {
    void read();
    void close();
    void bookmark();

    default void highlightText() {
        System.out.println("Highlighting text in the book.");
    }

    default void addNotes() {
        System.out.println("Adding notes to the margins of the book.");
    }
}
