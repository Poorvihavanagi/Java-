package com.xworkz.implement;

import com.xworkz.internal.Beverage;

public class Coffee implements Beverage {
    public void brew() {
        System.out.println("Brewing the coffee.");
    }

    public void pour() {
        System.out.println("Pouring the coffee into a cup.");
    }

    public void drink() {
        System.out.println("Drinking the hot coffee.");
    }
    @Override
    public void addSugar() {
        System.out.println("Adding sugar to the coffee.");
    }

    @Override
    public void addMilk() {
        System.out.println("Adding milk to the coffee.");
    }
}
