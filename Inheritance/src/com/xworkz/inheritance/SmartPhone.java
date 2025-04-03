package com.xworkz.inheritance;

public class SmartPhone extends Device{

    public void powerOn() {
        super.powerOn();
        System.out.println("Smartphone is now powered on...");
    }

    public void powerOff() {
        super.powerOff();
        System.out.println("Smartphone is now powered off...");
    }

    public void charge() {
        super.charge();
        System.out.println("Charging the smartphone...");
    }

    public void connectToNetwork() {
        super.connectToNetwork();
        System.out.println("Connecting the smartphone to Wi-Fi or mobile data...");
    }

    public void performTask() {
        super.performTask();
        System.out.println("Performing a task on the smartphone like browsing or using an app...");
    }
}
