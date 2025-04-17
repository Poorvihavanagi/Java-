package com.xworkz.internal;

public interface Shop {
    void openShop();
    void sellItems();
    void closeShop();

    default void applyDiscount() {
        System.out.println("Applying discount on selected items.");
    }

    default void printReceipt() {
        System.out.println("Printing the receipt for the customer.");
    }

}
