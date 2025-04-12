package com.xworkz.toString.runner;

import com.xworkz.toString.internal.CoffeeMaker;

public class CoffeeMakerRunner {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker("Nescafe", 5, "Espresso");
        System.out.println(coffeeMaker);

        int hash = coffeeMaker.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(coffeeMaker));

        CoffeeMaker coffeeMaker1 = new CoffeeMaker("Nescafe", 5, "Espresso");
        CoffeeMaker coffeeMaker2 = new CoffeeMaker("Nescafe", 6, "Americano");

        System.out.println("Checking same location: " + (coffeeMaker1 == coffeeMaker2));
        boolean same = coffeeMaker1.equals(coffeeMaker2);
        System.out.println("CoffeeMaker1 is same as CoffeeMaker2: " + same);

    }
}
