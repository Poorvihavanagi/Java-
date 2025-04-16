package com.xworkz.brandNew;

import com.xworkz.internal.Beverage;
import com.xworkz.internal.Mug;

public class Drink implements Beverage, Mug {

    @Override
    public void brew() {
        System.out.println("Brewing the beverage.");
    }

    @Override
    public void pour() {
        System.out.println("Pouring the beverage into the mug.");
    }

    @Override
    public void drink() {
        System.out.println("Drinking the beverage from the mug.");
    }

    @Override
    public void fill() {
        System.out.println("Filling the mug with the beverage.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the mug after use.");
    }
}
