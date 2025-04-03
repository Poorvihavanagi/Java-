package com.xworkz.inheritance;

public class ElectricLamp extends Lamp {
    public void turnOn() {
        super.turnOn();
        System.out.println("Electric lamp is now glowing...");
    }

    public void turnOff() {
        super.turnOff();
        System.out.println("Electric lamp is switched off...");
    }

    public void adjustBrightness() {
        super.adjustBrightness();
        System.out.println("Electric lamp brightness is adjusted...");
    }

    public void checkBulb() {
        super.checkBulb();
        System.out.println("Checking if the electric lamp’s bulb needs replacement...");
    }

    public void clean() {
        super.clean();
        System.out.println("Wiping the electric lamp with a cloth...");
    }
}
