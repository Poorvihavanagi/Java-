package com.xworkz.runner;

import com.xworkz.internal.Shop;
import com.xworkz.implement.GroceryShop;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new GroceryShop();
        shop.openShop();
        shop.sellItems();
        shop.closeShop();
    }
}
