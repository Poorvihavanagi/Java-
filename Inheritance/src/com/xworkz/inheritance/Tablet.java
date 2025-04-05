package com.xworkz.inheritance;

public class Tablet extends Medicine {
    @Override
    public void consume() {
        super.consume();
        System.out.println("Running consume in tablet...");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in tablet...");
    }

    @Override
    public void checkExpiry() {
        super.checkExpiry();
        System.out.println("Running checkExpiry in tablet...");
    }

    @Override
    public void prescribe() {
        super.prescribe();
        System.out.println("Running prescribe in tablet...");
    }

    @Override
    public void manufacture() {
        super.manufacture();
        System.out.println("Running manufacture in tablet...");
    }
}
