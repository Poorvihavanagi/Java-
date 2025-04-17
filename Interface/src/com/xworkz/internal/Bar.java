package com.xworkz.internal;

public interface Bar {
    void serveDrink();
    void playMusic();
    void closeBar();

    default void provideSnacks() {
        System.out.println("Providing complimentary snacks at the bar.");
    }

    default void offerDiscounts() {
        System.out.println("Offering discounts on cocktails during happy hour.");
    }
}
