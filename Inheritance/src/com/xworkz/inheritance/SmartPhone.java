package com.xworkz.inheritance;

public class SmartPhone extends Device {

    @Override
    public void powerOn() {
        super.powerOn();
        System.out.println("Running power on in smartphone");
    }

    @Override
    public void powerOff() {
        super.powerOff();
        System.out.println("Running power off in smartphone");
    }

    @Override
    public void charge() {
        super.charge();
        System.out.println("Running charge in smartphone");
    }

    @Override
    public void connectToNetwork() {
        super.connectToNetwork();
        System.out.println("Running connect to network in smartphone");
    }

    @Override
    public void performTask() {
        super.performTask();
        System.out.println("Running perform task in smartphone");
    }
}
