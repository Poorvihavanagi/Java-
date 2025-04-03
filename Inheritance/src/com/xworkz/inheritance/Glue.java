package com.xworkz.inheritance;

public class Glue extends Sticky {

    public void apply() {
        super.apply();
        System.out.println("Applying glue to join surfaces.");
    }

    public void dry() {
        super.dry();
        System.out.println("Allowing the glue to dry completely.");
    }
    public void bond() {
        super.bond();
        System.out.println("Glue is forming a strong bond.");
    }
    public void checkStickiness() {
        super.checkStickiness();
        System.out.println("Checking how strong the glue sticks.");
    }
    public void remove() {
        super.remove();
        System.out.println("Removing excess glue carefully.");
    }
}
