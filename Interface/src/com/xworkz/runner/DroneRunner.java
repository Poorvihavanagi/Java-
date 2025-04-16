package com.xworkz.runner;

import com.xworkz.implement.QuadDrone;
import com.xworkz.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone=new QuadDrone();
        drone.takeOff();
        drone.fly();
        drone.land();
    }
}
