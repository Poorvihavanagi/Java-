package com.xworkz.runner;

import com.xworkz.internal.Garden;
import com.xworkz.internal.Flower;
import com.xworkz.brandNew.Gardening;

public class GardeningRunner {
    public static void main(String[] args) {
        Garden garden = new Gardening();
        garden.plantFlowers();
        garden.waterPlants();
        garden.trimPlants();

        System.out.println("------------------------------");

        Flower flower = new Gardening();
        flower.bloom();
        flower.smell();
        flower.attractBees();
    }
}
