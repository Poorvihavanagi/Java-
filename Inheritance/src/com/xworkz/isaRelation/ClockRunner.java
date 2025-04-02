package com.xworkz.isaRelation;

import com.xworkz.inheritance.Clock;
import com.xworkz.inheritance.DigitalClock;

public class ClockRunner
{
    public static void main(String[] args) {
        DigitalClock digitalClock = new DigitalClock();
        digitalClock.showTime();
        digitalClock.setAlarm();
        digitalClock.stopAlarm();
        digitalClock.checkBattery();
        digitalClock.adjustTime();

        System.out.println("-------------------------");


        Clock clock = new DigitalClock();
        clock.showTime();
        clock.setAlarm();
        clock.stopAlarm();
        clock.checkBattery();
        clock.adjustTime();
    }
}
