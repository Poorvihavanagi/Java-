package com.xworkz.implement;

import com.xworkz.internal.Bicycle;

public class MountainBike implements Bicycle {
    public void pedal() {
        System.out.println("Pedaling the mountain bike.");
    }

    public void brake() {
        System.out.println("Applying brakes on the mountain bike.");
    }

    public void changeGear() {
        System.out.println("Changing gear of the mountain bike.");
    }
}
