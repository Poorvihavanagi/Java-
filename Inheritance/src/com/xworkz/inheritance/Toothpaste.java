package com.xworkz.inheritance;

public class Toothpaste extends Product {

    @Override
    public void use() {
        super.use();
        System.out.println("Running use in toothpaste...");
    }

    @Override
    public void checkExpiry() {
        super.checkExpiry();
        System.out.println("Running checkExpiry in toothpaste...");
    }

    @Override
    public void apply() {
        super.apply();
        System.out.println("Running apply in toothpaste...");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in toothpaste...");
    }

    @Override
    public void dispose() {
        super.dispose();
        System.out.println("Running dispose in toothpaste...");
    }
}
