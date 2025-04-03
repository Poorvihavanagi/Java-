package com.xworkz.isaRelation;

import com.xworkz.inheritance.Flower;
import com.xworkz.inheritance.Rose;

public class FlowerRunner {
    public static void main(String[] args) {

        Rose rose = new Rose();
        rose.bloom();
        rose.smell();
        rose.photosynthesize();
        rose.attractBees();
        rose.wither();

        System.out.println("------------------------------------------------");

        Flower flower = new Rose();
        flower.bloom();
        flower.smell();
        flower.photosynthesize();
        flower.attractBees();
        flower.wither();
    }
}
