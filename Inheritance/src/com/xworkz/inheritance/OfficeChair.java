package com.xworkz.inheritance;

public class OfficeChair extends Chair {

    @Override
    public void sit() {
        super.sit();
        System.out.println("Running sit in office chair...");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Running move in office chair...");
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Running fold in office chair...");
    }

    @Override
    public void adjustHeight() {
        super.adjustHeight();
        System.out.println("Running adjust height in office chair...");
    }

    @Override
    public void checkMaterial() {
        super.checkMaterial();
        System.out.println("Running check material in office chair...");
    }
}
