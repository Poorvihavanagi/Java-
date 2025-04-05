package com.xworkz.inheritance;

public class WashingMachine extends Appliances {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Running turn on in washing machine...");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Running turn off in washing machine...");
    }

    @Override
    public void checkPower() {
        super.checkPower();
        System.out.println("Running check power in washing machine...");
    }

    @Override
    public void repair() {
        super.repair();
        System.out.println("Running repair in washing machine...");
    }

    @Override
    public void displayBrand() {
        super.displayBrand();
        System.out.println("Running display brand in washing machine...");
    }
}
