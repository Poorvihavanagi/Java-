package com.xworkz.copies;

import com.xworkz.brandNew.FoodHub;
import com.xworkz.internal.Bakery;
import com.xworkz.internal.Food;

public class FoodHubRunner {
    public static void main(String[] args) {
        Bakery bakery = new FoodHub();
        bakery.bakeItem();
        bakery.displayItems();
        bakery.sellItem();

        System.out.println("------------------------------");

        Food food = new FoodHub();
        food.prepare();
        food.serve();
        food.consume();
    }
}
