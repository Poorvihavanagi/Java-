package com.xworkz.inheritance;

public class ElectricLamp extends Lamp {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Running turn On in electric lamp...");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Running turn Off in electric lamp...");
    }

    @Override
    public void adjustBrightness() {
        super.adjustBrightness();
        System.out.println("Running adjust Brightness in electric lamp...");
    }

    @Override
    public void checkBulb() {
        super.checkBulb();
        System.out.println("Running check Bulb in electric lamp...");
    }

    @Override
    public void clean() {
        super.clean();
        System.out.println("Running clean in electric lamp...");
    }
}
