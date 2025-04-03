package com.xworkz.inheritance;

public class Tree extends Plant {
    @Override
    public void grow() {
        super.grow();
        System.out.println("The tree is growing tall and strong...");
    }

    public void produceOxygen() {
        super.produceOxygen();
        System.out.println("The tree produces a large amount of oxygen...");
    }

    public void photosynthesis() {
        System.out.println("The tree provides shade to animals and humans...");
    }

    public void absorbWater() {
        System.out.println("Some trees bear delicious fruits...");
    }

    public void bloom() {
        System.out.println("The tree sheds leaves in autumn...");
    }
}
