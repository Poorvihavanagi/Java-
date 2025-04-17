package com.xworkz.internal;

public interface Chocolate {
    void unwrap();
    void eat();
    void store();

    default void melt() {
        System.out.println("Melting the chocolate.");
    }

    default void wrapUp() {
        System.out.println("Wrapping up the chocolate after consumption.");
    }
}
