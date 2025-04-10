package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Tripod;

public class TripodRunner {
    public static void main(String[] args) {
        Tripod tripod = new Tripod("Digitek", 150, "Aluminum");
        System.out.println(tripod);

        int hash = tripod.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tripod));
    }
}
