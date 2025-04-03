package com.xworkz.inheritance;

public class Necklace extends Jewel {

    public void shine() {
        super.shine();
        System.out.println("The necklace is sparkling with diamonds...");
    }

    public void wear() {
        super.wear();
        System.out.println("Wearing the necklace for a special occasion...");
    }

    public void polish() {
        super.polish();
        System.out.println("Polishing the necklace to maintain its beauty...");
    }

    public void checkPurity() {
        super.checkPurity();
        System.out.println("Checking if the necklace is made of pure gold...");
    }

    public void storeSafely() {
        super.storeSafely();
        System.out.println("Keeping the necklace in a jewelry box...");
    }
}
