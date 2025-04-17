package com.xworkz.implement;

import com.xworkz.internal.Bakery;

public class CakeBakery implements Bakery {
    public void bakeItem() {
        System.out.println("Baking delicious cakes in the bakery.");
    }

    public void displayItems() {
        System.out.println("Displaying cakes and pastries at the counter.");
    }

    public void sellItem() {
        System.out.println("Selling a cake to the customer.");
    }
    @Override
    public void offerDiscount() {
        System.out.println("Offering a special discount on birthday cakes.");
    }

    @Override
    public void advertise() {
        System.out.println("Advertising our fresh cakes on Instagram.");
    }
}
