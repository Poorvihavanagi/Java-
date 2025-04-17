package com.xworkz.brandNew;

import com.xworkz.internal.Bakery;
import com.xworkz.internal.Food;

public class FoodHub implements Bakery, Food {

    @Override
    public void bakeItem() {
        System.out.println("Baking fresh bread and pastries.");
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying baked items in the showcase.");
    }

    @Override
    public void sellItem() {
        System.out.println("Selling bakery items to customers.");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing food orders from the kitchen.");
    }

    @Override
    public void serve() {
        System.out.println("Serving food to customers at the table.");
    }

    @Override
    public void consume() {
        System.out.println("Customers are enjoying the delicious food.");
    }
}
