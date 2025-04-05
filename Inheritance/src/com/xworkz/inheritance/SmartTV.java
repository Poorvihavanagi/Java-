package com.xworkz.inheritance;

public class SmartTV extends TV {

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Running turn on in smart TV");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Running turn off in smart TV");
    }

    @Override
    public void changeChannel() {
        super.changeChannel();
        System.out.println("Running change channel in smart TV");
    }

    @Override
    public void adjustVolume() {
        super.adjustVolume();
        System.out.println("Running adjust volume in smart TV");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Running display info in smart TV");
    }
}
