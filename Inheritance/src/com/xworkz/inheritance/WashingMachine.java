package com.xworkz.inheritance;

public class WashingMachine extends Appliances {

    public void turnOn() {
        super.turnOn();
        System.out.println("Washing machine is starting...");
    }

    public void turnOff() {
        super.turnOff();
        System.out.println("Washing machine is shutting down...");
    }

    public void checkPower() {
        super.checkPower();
        System.out.println("Washing machine power supply is stable...");
    }

    public void repair() {
        super.repair();
        System.out.println("Washing machine maintenance required...");
    }


    public void displayBrand() {
        super.displayBrand();
        System.out.println("Washing machine brand: Samsung...");
    }

}
