package com.xworkz.internal;

public interface Printer {
    void print();
    void scan();
    void cancelJob();

    default void connectToNetwork() {
        System.out.println("Connecting the printer to the network.");
    }

    default void checkInkLevel() {
        System.out.println("Checking the printer's ink level.");
    }
}
