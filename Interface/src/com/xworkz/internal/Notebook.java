package com.xworkz.internal;

public interface Notebook {
    void write();
    void flipPages();
    void tearPage();
    default void checkPageCount() {
        System.out.println("Checking the number of pages left in the notebook.");
    }

    default void displayCoverMaterial() {
        System.out.println("Displaying the cover material of the notebook.");
    }
}
