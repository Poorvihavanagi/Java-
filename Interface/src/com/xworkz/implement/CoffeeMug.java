package com.xworkz.implement;

import com.xworkz.internal.Mug;

public class CoffeeMug implements Mug {
    public void fill() {
        System.out.println("Filling the mug with coffee.");
    }

    public void drink() {
        System.out.println("Drinking the coffee from the mug.");
    }

    public void clean() {
        System.out.println("Cleaning the coffee mug.");
    }
}
