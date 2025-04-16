package com.xworkz.implement;

import com.xworkz.internal.Shop;

public class GroceryShop implements Shop {
    public void openShop() {
        System.out.println("Opening the grocery shop in the morning.");
    }

    public void sellItems() {
        System.out.println("Selling groceries to customers.");
    }

    public void closeShop() {
        System.out.println("Closing the grocery shop in the evening.");
    }
}
