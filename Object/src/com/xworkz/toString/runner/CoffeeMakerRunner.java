package com.xworkz.toString.runner;

import com.xworkz.toString.internal.CoffeeMaker;

public class CoffeeMakerRunner {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker("Nescafe", 5, "Espresso");
        System.out.println(coffeeMaker);
    }
}
