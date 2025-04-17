package com.xworkz.internal;

public interface TrafficLight {
    void turnRed();
    void turnYellow();
    void turnGreen();
    default void startAutomaticCycle() {
        System.out.println("Starting automatic traffic light cycle.");
    }

    default void turnOff() {
        System.out.println("Turning off the traffic light.");
    }
}
