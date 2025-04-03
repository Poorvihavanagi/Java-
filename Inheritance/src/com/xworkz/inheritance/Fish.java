package com.xworkz.inheritance;

public class Fish extends Aquatic {

    public void swim() {
        super.swim();
        System.out.println("Fish swims using fins and tail...");
    }
    public void breatheUnderwater() {
        super.breatheUnderwater();
        System.out.println("Fish uses gills to extract oxygen from water...");
    }
    public void layEggs() {
        super.layEggs();
        System.out.println("Most fish lay thousands of eggs at a time...");
    }
    public void adaptToWater() {
        super.adaptToWater();
        System.out.println("Fish have streamlined bodies for better swimming...");
    }
    public void liveInWater() {
        super.liveInWater();
        System.out.println("Fish cannot survive outside water...");
    }
}
