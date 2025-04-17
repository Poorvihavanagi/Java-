package com.xworkz.implement;

import com.xworkz.internal.Drone;

public class QuadDrone implements Drone {
    public void takeOff() {
        System.out.println("Drone taking off.");
    }

    public void fly() {
        System.out.println("Drone flying.");
    }

    public void land() {
        System.out.println("Drone landing.");
    }
    @Override
    public void charge() {
        System.out.println("Charging the quad drone.");
    }

    @Override
    public void hover() {
        System.out.println("Quad drone is hovering.");
    }
}
