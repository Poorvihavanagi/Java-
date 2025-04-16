package com.xworkz.runner;

import com.xworkz.internal.Shopping;
import com.xworkz.implement.GroceryShopping;

public class ShoppingRunner {
    public static void main(String[] args) {
        Shopping shopping = new GroceryShopping();
        shopping.addItem();
        shopping.pay();
        shopping.checkout();
    }
}
