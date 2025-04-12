package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Drone;

public class DroneRunner {
    public static void main(String[] args) {

        Drone drone = new Drone("DJI Mini", 30, "4K");
        System.out.println(drone);

        int hash = drone.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(drone));

        Drone drone1 = new Drone("DJI Mini", 30, "4K");
        Drone drone2 = new Drone("Parrot Anafi", 25, "Full HD");

        System.out.println("Checking same location: " + (drone1 == drone2));
        boolean same = drone1.equals(drone2);
        System.out.println("Drone1 is same as Drone2: " + same);


    }
}
