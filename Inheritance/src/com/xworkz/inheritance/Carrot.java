
package com.xworkz.inheritance;

public class Carrot extends Vegetable {
    public void grow() {
        super.grow();
        System.out.println("Carrot is growing underground...");
    }
    public void harvest() {
        super.harvest();
        System.out.println("Pulling out carrots from the soil...");
    }

    public void wash() {
        super.wash();
        System.out.println("Washing the carrot to remove dirt...");
    }

    public void chop() {
        super.chop();
        System.out.println("Chopping the carrot into slices...");
    }
    public void cook() {
        super.cook();
        System.out.println("Cooking the carrot in a delicious dish...");
    }
}
