package com.xworkz.inheritance;

public class Necklace extends Jewel {

    @Override
    public void shine() {
        super.shine();
        System.out.println("Running shine in necklace...");
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in necklace...");
    }

    @Override
    public void polish() {
        super.polish();
        System.out.println("Running polish in necklace...");
    }

    @Override
    public void checkPurity() {
        super.checkPurity();
        System.out.println("Running checkPurity in necklace...");
    }

    @Override
    public void storeSafely() {
        super.storeSafely();
        System.out.println("Running storeSafely in necklace...");
    }
}
