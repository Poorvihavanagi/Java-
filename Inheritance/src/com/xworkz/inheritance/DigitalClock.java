package com.xworkz.inheritance;

public class DigitalClock extends Clock {

    public void showTime() {
        super.showTime();
        System.out.println("Displaying the digital time on the LED screen...");
    }
    public void setAlarm() {
        super.setAlarm();
        System.out.println("Setting an alarm with a digital sound...");
    }
    public void stopAlarm() {
        super.stopAlarm();
        System.out.println("Stopping the digital alarm...");
    }
    public void checkBattery() {
        super.checkBattery();
        System.out.println("Checking the battery level of the digital clock...");
    }
    public void adjustTime() {
        super.adjustTime();
        System.out.println("Automatically syncing digital time with the internet...");
    }
}
