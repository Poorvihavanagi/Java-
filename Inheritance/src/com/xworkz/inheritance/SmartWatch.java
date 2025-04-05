package com.xworkz.inheritance;

public class SmartWatch extends Watch {

    @Override
    public void showTime() {
        super.showTime();
        System.out.println("Running show time in smart watch");
    }

    @Override
    public void setAlarm() {
        super.setAlarm();
        System.out.println("Running set alarm in smart watch");
    }

    @Override
    public void tick() {
        super.tick();
        System.out.println("Running tick in smart watch");
    }

    @Override
    public void checkBattery() {
        super.checkBattery();
        System.out.println("Running check battery in smart watch");
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in smart watch");
    }
}
