package com.xworkz.inheritance;

public class Plate extends Dish
{
    public void serveFood() {
        System.out.println("Serving food on the plate...");
    }

    public void clean() {
        System.out.println("Cleaning the plate...");
    }

    public void stack() {
        System.out.println("Stacking the plate...");
    }

    public void checkMaterial() {
        System.out.println("Checking the plate material...");
    }

    public void dry() {
        System.out.println("Drying the plate...");
    }
}
