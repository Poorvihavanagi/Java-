package com.xworkz.inheritance;

public class Cushion extends Bed {

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Running sleep in Cushion");
    }

    @Override
    public void makeBed() {
        super.makeBed();
        System.out.println("Running makeBed in Cushion");
    }

    @Override
    public void checkComfort() {
        super.checkComfort();
        System.out.println("Running checkComfort in Cushion");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold in Cushion");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Running move in Cushion");
    }
}
