package com.xworkz.inheritance;

public class Cup extends Mug
{
    public void fill() {
        super.fill();
        System.out.println("Filling the coffee mug with hot coffee...");
    }

    public void drink() {
        super.drink();
        System.out.println("Drinking hot coffee from the coffee mug...");
    }

    public void wash() {
        super.wash();
        System.out.println("Washing the coffee mug with care...");
    }

    public void heat() {
        super.heat();
        System.out.println("Heating the coffee mug safely...");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the coffee mug is made of ceramic...");
    }

}
