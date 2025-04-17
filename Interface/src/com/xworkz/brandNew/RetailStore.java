package com.xworkz.brandNew;

import com.xworkz.internal.Shop;
import com.xworkz.internal.Shopping;

public class RetailStore implements Shop, Shopping {

    @Override
    public void openShop() {
        System.out.println("Retail outlet is now open.");
    }

    @Override
    public void sellItems() {
        System.out.println("Selling items to customers.");
    }

    @Override
    public void closeShop() {
        System.out.println("Retail outlet is now closed.");
    }

    @Override
    public void applyDiscount() {
        System.out.println("Running applydiscount");
    }

    @Override
    public void provideReceipt() {
        Shopping.super.provideReceipt();
    }

    @Override
    public void printReceipt() {
        Shop.super.printReceipt();
    }

    @Override
    public void addItem() {
        System.out.println("Adding item to the shopping cart.");
    }

    @Override
    public void pay() {
        System.out.println("Processing payment for purchased items.");
    }

    @Override
    public void checkout() {
        System.out.println("Completing the checkout process.");
    }
}
