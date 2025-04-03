package com.xworkz.inheritance;

public class SmartTV extends TV {

    public void turnOn() {
        super.turnOn();
        System.out.println("Turning on the Smart TV with voice command...");
    }

    public void turnOff() {
        super.turnOff();
        System.out.println("Turning off the Smart TV remotely...");
    }

    public void changeChannel() {
        super.changeChannel();
        System.out.println("Changing the channel using the Smart TV remote...");
    }

    public void adjustVolume() {
        super.adjustVolume();
        System.out.println("Adjusting the volume using Smart TV settings...");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Displaying Smart TV specifications...");
    }
}
