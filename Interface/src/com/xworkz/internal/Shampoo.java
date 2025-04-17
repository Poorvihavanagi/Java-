package com.xworkz.internal;

public interface Shampoo {
    void apply();
    void rinse();
    void store();
    default void checkExpiry() {
        System.out.println("Checking the expiry date of the shampoo.");
    }

    default void shake() {
        System.out.println("Shaking the shampoo bottle before use.");
    }
}
