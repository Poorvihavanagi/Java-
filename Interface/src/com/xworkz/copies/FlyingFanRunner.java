package com.xworkz.copies;

import com.xworkz.brandNew.FlyingFan;
import com.xworkz.internal.Drone;
import com.xworkz.internal.Fan;

public class FlyingFanRunner {
    public static void main(String[] args) {
        Drone drone = new FlyingFan();
        drone.takeOff();
        drone.fly();
        drone.land();

        System.out.println("------------------------------");

        Fan fan = new FlyingFan();
        fan.turnOn();
        fan.turnOff();
        fan.changeSpeed();
    }
}
