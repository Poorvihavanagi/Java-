package com.xworkz.runner;

import com.xworkz.internal.Bakery;
import com.xworkz.implement.CakeBakery;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bakery = new CakeBakery();
        bakery.bakeItem();
        bakery.displayItems();
        bakery.sellItem();

        bakery.offerDiscount();
        bakery.advertise();
    }
}
