package com.xworkz.internal;

public interface Ladder {
    void extend();
    void climb();
    void fold();
    default void setHeight() {
        System.out.println("Setting the ladder to the desired height.");
    }
}
