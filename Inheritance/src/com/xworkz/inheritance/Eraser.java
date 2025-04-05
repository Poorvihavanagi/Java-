package com.xworkz.inheritance;

public class Eraser extends Stationery {

    @Override
    public void use() {
        super.use();
        System.out.println("Running use in eraser...");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running store in eraser...");
    }

    @Override
    public void checkQuality() {
        super.checkQuality();
        System.out.println("Running checkQuality in eraser...");
    }

    @Override
    public void replace() {
        super.replace();
        System.out.println("Running replace in eraser...");
    }

    @Override
    public void dispose() {
        super.dispose();
        System.out.println("Running dispose in eraser...");
    }
}
