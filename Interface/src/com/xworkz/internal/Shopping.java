package com.xworkz.internal;

public interface Shopping {
    void addItem();
    void pay();
    void checkout();

    default void applyDiscount() {
        System.out.println("Applying discount to the total purchase.");
    }

    default void provideReceipt() {
        System.out.println("Providing the receipt after purchase.");
    }
}
