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
}
