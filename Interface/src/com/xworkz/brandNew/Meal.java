package com.xworkz.brandNew;

import com.xworkz.internal.Fruit;
import com.xworkz.internal.Food;

public class Meal implements Fruit, Food {

    @Override
    public void peel() {
        System.out.println("Peeling the fruit before eating.");
    }

    @Override
    public void eat() {
        System.out.println("Eating the fresh and juicy fruit.");
    }

    @Override
    public void store() {
        System.out.println("Storing the remaining fruit in the refrigerator.");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing a healthy fruit salad.");
    }

    @Override
    public void serve() {
        System.out.println("Serving the fruit salad in a bowl.");
    }

    @Override
    public void consume() {
        System.out.println("Consuming the prepared fruit salad.");
    }
}
