package com.xworkz.internal;

public interface Calendar {
    void showDate();
    void showMonth();
    void flipPage();
    default void displayYear() {
        System.out.println("Displaying the current year on the calendar.");
    }
}
