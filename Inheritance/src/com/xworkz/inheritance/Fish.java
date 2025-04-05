package com.xworkz.inheritance;

public class Fish extends Aquatic {

    @Override
    public void swim() {
        super.swim();
        System.out.println("Running swim in fish...");
    }

    @Override
    public void breatheUnderwater() {
        super.breatheUnderwater();
        System.out.println("Running breathe Underwater in fish...");
    }

    @Override
    public void layEggs() {
        super.layEggs();
        System.out.println("Running lay Eggs in fish...");
    }

    @Override
    public void adaptToWater() {
        super.adaptToWater();
        System.out.println("Running adapt To Water in fish...");
    }

    @Override
    public void liveInWater() {
        super.liveInWater();
        System.out.println("Running live In Water in fish...");
    }
}
