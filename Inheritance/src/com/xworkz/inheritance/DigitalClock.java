package com.xworkz.inheritance;

public class DigitalClock extends Clock {

    @Override
    public void showTime() {
        super.showTime();
        System.out.println("Running showTime in DigitalClock");
    }

    @Override
    public void setAlarm() {
        super.setAlarm();
        System.out.println("Running setAlarm in DigitalClock");
    }

    @Override
    public void stopAlarm() {
        super.stopAlarm();
        System.out.println("Running stopAlarm in DigitalClock");
    }

    @Override
    public void checkBattery() {
        super.checkBattery();
        System.out.println("Running checkBattery in DigitalClock");
    }

    @Override
    public void adjustTime() {
        super.adjustTime();
        System.out.println("Running adjustTime in DigitalClock");
    }
}
