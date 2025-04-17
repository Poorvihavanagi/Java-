package com.xworkz.runner;

import com.xworkz.implement.CeilingFan;
import com.xworkz.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan=new CeilingFan();
        fan.turnOn();
        fan.turnOff();
        fan.changeSpeed();

        fan.oscillate();
        fan.displayStatus();
    }
}
