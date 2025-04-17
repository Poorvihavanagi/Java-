package com.xworkz.internal;

public interface Candle {
    void lightUp();
    void melt();
    void giveFragrance();
    default void extinguish() {
        System.out.println("Extinguishing the candle.");
    }

    default void cleanUp() {
        System.out.println("Cleaning the melted candle residue.");
    }
}
