package com.xworkz.internal;

public interface Newspaper {
    void read();
    void subscribe();
    void discard();
    default void getEdition() {
        System.out.println("Getting the current edition of the newspaper.");
    }

    default void checkSubscriptionStatus() {
        System.out.println("Checking the subscription status of the newspaper.");
    }
}
