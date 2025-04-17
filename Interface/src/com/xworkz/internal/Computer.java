package com.xworkz.internal;

public interface Computer {
    void boot();
    void shutDown();
    void runProgram();
    default void restart() {
        System.out.println("Restarting the computer.");
    }

    default void displayInfo() {
        System.out.println("Displaying computer information.");
    }
}
