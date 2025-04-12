package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Tripod;

public class TripodRunner {
    public static void main(String[] args) {
        Tripod tripod = new Tripod("Digitek", 150, "Aluminum");
        System.out.println(tripod);

        int hash = tripod.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tripod));

        Tripod tripod1 = new Tripod("Digitek", 150, "Aluminum");
        Tripod tripod2 = new Tripod("Manfrotto", 170, "Carbon Fiber");

        System.out.println("Checking same location: " + (tripod1 == tripod2));
        boolean same = tripod1.equals(tripod2);
        System.out.println("Tripod1 is same as Tripod2: " + same);
    }
}
