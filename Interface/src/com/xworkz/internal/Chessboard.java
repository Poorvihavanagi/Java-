package com.xworkz.internal;

public interface Chessboard {
    void setUp();
    void play();
    void store();

    default void clean() {
        System.out.println("Cleaning the chessboard.");
    }

    default void fold() {
        System.out.println("Folding the chessboard for storage.");
    }
}
