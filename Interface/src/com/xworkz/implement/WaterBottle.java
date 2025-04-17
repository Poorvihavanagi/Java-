package com.xworkz.implement;

import com.xworkz.internal.Bottle;

public class WaterBottle implements Bottle {
    public void fill() {
        System.out.println("Filling the bottle.");
    }

    public void drink() {
        System.out.println("Drinking from the bottle.");
    }

    public void empty() {
        System.out.println("Emptying the bottle.");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the water bottle after use.");
    }

    @Override
    public void store() {
        System.out.println("Storing the water bottle in the kitchen.");
    }
}
