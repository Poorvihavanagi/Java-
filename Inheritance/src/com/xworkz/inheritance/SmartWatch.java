package com.xworkz.inheritance;

public class SmartWatch extends Watch {

    public void showTime() {
        super.showTime();
        System.out.println("Displaying digital time on the smartwatch...");
    }

    public void setAlarm() {
        super.setAlarm();
        System.out.println("Setting an alarm with vibration on the smartwatch...");
    }

    public void tick() {
        super.tick();
        System.out.println("The smartwatch is showing a ticking animation...");
    }

    public void checkBattery() {
        super.checkBattery();
        System.out.println("Checking battery percentage of the smartwatch...");
    }

    public void wear() {
        super.wear();
        System.out.println("Wearing the smartwatch with a fitness tracker...");
    }
}
