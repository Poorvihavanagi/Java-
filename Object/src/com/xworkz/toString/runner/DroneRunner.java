package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {

        Drone drone = new Drone("DJI Mini", 30, "4K");
        System.out.println(drone);

        int hash = drone.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(drone));
    }
}
