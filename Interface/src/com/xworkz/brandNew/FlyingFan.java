package com.xworkz.brandNew;

import com.xworkz.internal.Drone;
import com.xworkz.internal.Fan;

public class FlyingFan implements Drone, Fan {


    @Override
    public void takeOff() {
        System.out.println("The drone is taking off.");
    }

    @Override
    public void fly() {
        System.out.println("The drone is flying.");
    }

    @Override
    public void land() {
        System.out.println("The drone is landing.");
    }


    @Override
    public void turnOn() {
        System.out.println("Turning the fan on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning the fan off.");
    }

    @Override
    public void changeSpeed() {
        System.out.println("Changing the fan speed.");
    }
}
