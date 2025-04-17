package com.xworkz.implement;

import com.xworkz.internal.TrafficLight;

public class SmartTrafficLight implements TrafficLight {
    public void turnRed() {
        System.out.println("Red light ON - Vehicles must stop.");
    }

    public void turnYellow() {
        System.out.println("Yellow light ON - Vehicles should slow down.");
    }

    public void turnGreen() {
        System.out.println("Green light ON - Vehicles can go.");
    }
    @Override
    public void startAutomaticCycle() {
        System.out.println("Smart traffic light starting automatic cycle.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart traffic light turned off.");
    }
}
