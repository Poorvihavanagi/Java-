package com.xworkz.runner;

import com.xworkz.implement.MountainBike;
import com.xworkz.internal.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new MountainBike();
        bicycle.pedal();
        bicycle.brake();
        bicycle.changeGear();
        bicycle.ringBell();
        bicycle.turnLightsOn();
    }
}
