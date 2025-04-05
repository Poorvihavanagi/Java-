package com.xworkz.inheritance;

public class Tree extends Plant {

    @Override
    public void grow() {
        super.grow();
        System.out.println("Running grow in tree...");
    }

    @Override
    public void produceOxygen() {
        super.produceOxygen();
        System.out.println("Running produce oxygen in tree...");
    }

    @Override
    public void photosynthesis() {
        super.photosynthesis();
        System.out.println("Running photosynthesis in tree...");
    }

    @Override
    public void absorbWater() {
        super.absorbWater();
        System.out.println("Running absorb water in tree...");
    }

    @Override
    public void bloom() {
        super.bloom();
        System.out.println("Running bloom in tree...");
    }
}
