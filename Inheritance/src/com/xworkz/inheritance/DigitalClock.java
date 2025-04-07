package com.xworkz.inheritance;

public class DigitalClock extends Clock {

    @Override
    public void showTime() {
        super.showTime();
        System.out.println("Running show Time in Digital Clock");
    }

    @Override
    public void setAlarm() {
        super.setAlarm();
        System.out.println("Running set Alarm in Digital Clock");
    }

    @Override
    public void stopAlarm() {
        super.stopAlarm();
        System.out.println("Running stop Alarm in Digital Clock");
    }

    @Override
    public void checkBattery() {
        super.checkBattery();
        System.out.println("Running check Battery in Digital Clock");
    }

    @Override
    public void adjustTime() {
        super.adjustTime();
        System.out.println("Running adjust Time in Digital Clock");
    }

    public void displayTime(){
        System.out.println("Running display time in digital clock");
    }
}
