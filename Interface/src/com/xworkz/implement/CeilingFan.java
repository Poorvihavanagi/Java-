package com.xworkz.implement;
import com.xworkz.internal.Fan;

public class CeilingFan implements Fan{
    public void turnOn() {
        System.out.println("Fan is ON.");
    }

    public void turnOff() {
        System.out.println("Fan is OFF.");
    }

    public void changeSpeed() {
        System.out.println("Fan speed changed.");
    }
    @Override
    public void oscillate() {
        System.out.println("Ceiling fan is oscillating.");
    }

    @Override
    public void displayStatus() {
        System.out.println("Ceiling fan is operational.");
    }
}
