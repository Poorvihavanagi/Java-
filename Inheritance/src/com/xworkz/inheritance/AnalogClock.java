package com.xworkz.inheritance;

public class AnalogClock extends Clock{
    public void displayTime(){
        System.out.println("Displaying time in digital format");
    }

    public void windClock(Clock clock){
        clock.adjustTime();
        clock.checkBattery();
        clock.setAlarm();
        clock.stopAlarm();
        clock.showTime();

        if(clock instanceof AnalogClock){
            System.out.println("Clock is instance of analog clock");
            AnalogClock analogClock=(AnalogClock) clock;
            analogClock.displayTime();
        }
    }
}
