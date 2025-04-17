package com.xworkz.internal;

public interface BagOfChips {
    void openBag();
    void eatChips();
    void closeBag();

    default void shakeBag() {
        System.out.println("Shaking the bag of chips.");
    }

    default void resealBag() {
        System.out.println("Resealing the bag of chips to keep them fresh.");
    }
}
