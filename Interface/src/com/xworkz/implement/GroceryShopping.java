package com.xworkz.implement;

import com.xworkz.internal.Shopping;

public class GroceryShopping implements Shopping {
    public void addItem() {
        System.out.println("Adding grocery items to the cart.");
    }

    public void pay() {
        System.out.println("Paying for the grocery items.");
    }

    public void checkout() {
        System.out.println("Checking out and leaving the store.");
    }
    @Override
    public void applyDiscount() {
        System.out.println("Applying discount for grocery shopping.");
    }

    @Override
    public void provideReceipt() {
        System.out.println("Providing grocery shopping receipt.");
    }
}
