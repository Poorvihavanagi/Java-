package com.xworkz.runner;

import com.xworkz.internal.Garden;
import com.xworkz.implement.FlowerGarden;

public class GardenRunner {
    public static void main(String[] args) {
        Garden garden = new FlowerGarden();
        garden.plantFlowers();
        garden.waterPlants();
        garden.trimPlants();
        garden.maintainGarden();
    }
}
