package com.xworkz.isaRelation;

import com.xworkz.inheritance.Plant;
import com.xworkz.inheritance.Tree;

public class PlantRunner {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.photosynthesis();
        tree.absorbWater();
        tree.grow();
        tree.produceOxygen();
        tree.bloom();

        System.out.println("---------------------------------");
        Plant plant = new Tree();
        plant.photosynthesis();
        plant.absorbWater();
        plant.grow();
        plant.produceOxygen();
        plant.bloom();
    }
}
