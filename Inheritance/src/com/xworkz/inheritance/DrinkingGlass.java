package com.xworkz.inheritance;

public class DrinkingGlass extends Glass {

    public void fill() {
        super.fill();
        System.out.println("Running fill in DrinkingGlass");
    }

    public void drink() {
        super.drink();
        System.out.println("Running drink in DrinkingGlass");
    }

    public void clean() {
        super.clean();
        System.out.println("Running clean in DrinkingGlass");
    }

    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running checkMaterial in DrinkingGlass");
    }

    public void empty() {
        super.empty();
        System.out.println("Running empty in DrinkingGlass");
    }
}
