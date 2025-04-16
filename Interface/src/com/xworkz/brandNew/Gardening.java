package com.xworkz.brandNew;

import com.xworkz.internal.Garden;
import com.xworkz.internal.Flower;

public class Gardening implements Garden, Flower {

    @Override
    public void plantFlowers() {
        System.out.println("Planting a variety of flowers in the garden.");
    }

    @Override
    public void waterPlants() {
        System.out.println("Watering the plants in the garden.");
    }

    @Override
    public void trimPlants() {
        System.out.println("Trimming the plants to maintain their shape.");
    }

    @Override
    public void bloom() {
        System.out.println("The flowers are blooming in the garden.");
    }

    @Override
    public void smell() {
        System.out.println("The flowers are emitting a sweet fragrance.");
    }

    @Override
    public void attractBees() {
        System.out.println("The flowers are attracting bees with their scent.");
    }
}
