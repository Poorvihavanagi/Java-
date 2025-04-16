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
}
