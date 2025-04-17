package com.xworkz.internal;

public interface Bakery {
    void bakeItem();
    void displayItems();
    void sellItem();

    default void offerDiscount() {
        System.out.println("Offering a discount on select items.");
    }

    default void advertise() {
        System.out.println("Advertising bakery products on social media.");
    }
}
