package com.xworkz.inheritance;

public class Paint extends Coating {
    public void apply() {
        super.apply();
        System.out.println("Applying paint on the wall...");
    }
    public void dry() {
        super.dry();
        System.out.println("Waiting for the paint to dry completely...");
    }
    public void checkQuality() {
        super.checkQuality();
        System.out.println("Checking if the paint is smooth and even...");
    }
    public void remove() {
        super.remove();
        System.out.println("Scraping off old paint before repainting...");
    }
    public void protectSurface() {
        super.protectSurface();
        System.out.println("Paint protecting the surface from damage and moisture...");
    }
}
