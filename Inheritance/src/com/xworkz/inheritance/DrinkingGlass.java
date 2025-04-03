package com.xworkz.inheritance;

public class DrinkingGlass extends Glass {
    public void fill() {
        super.fill();
        System.out.println("Filling the drinking glass with water...");
    }

    public void drink() {
        super.drink();
        System.out.println("Drinking water from the drinking glass...");
    }
    public void clean() {
        super.clean();
        System.out.println("Washing the drinking glass properly...");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Checking if the drinking glass is made of glass material...");
    }
    public void empty() {
        super.empty();
        System.out.println("Emptying the drinking glass after use...");
    }
}
