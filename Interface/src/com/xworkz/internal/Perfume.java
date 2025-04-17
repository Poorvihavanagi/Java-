package com.xworkz.internal;

public interface Perfume {
    void spray();
    void refill();
    void giveFragrance();
    default void checkExpiry() {
        System.out.println("Checking the expiry date of the perfume.");
    }

    default void displayBrand() {
        System.out.println("Displaying the brand name of the perfume.");
    }
}
