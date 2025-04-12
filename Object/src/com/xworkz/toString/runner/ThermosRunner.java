package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Thermos;

public class ThermosRunner {
    public static void main(String[] args) {
        Thermos thermos = new Thermos("Milton", 750, "Blue");
        System.out.println(thermos);

        int hash = thermos.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(thermos));

        Thermos thermos1 = new Thermos("Milton", 750, "Blue");
        Thermos thermos2 = new Thermos("Milton", 750, "Blue");

        System.out.println("Checking same location: " + (thermos1 == thermos2));
        boolean same = thermos1.equals(thermos2);
        System.out.println("Thermos1 is same as Thermos2: " + same);
    }
}
