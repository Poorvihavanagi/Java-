package com.xworkz.inheritance;

public class Marble extends Stone {

    @Override
    public void extract() {
        super.extract();
        System.out.println("Running extract in marble...");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("Running cut in marble...");
    }

    @Override
    public void polish() {
        super.polish();
        System.out.println("Running polish in marble...");
    }

    @Override
    public void use() {
        super.use();
        System.out.println("Running use in marble...");
    }

    @Override
    public void checkQuality() {
        super.checkQuality();
        System.out.println("Running checkQuality in marble...");
    }
}
