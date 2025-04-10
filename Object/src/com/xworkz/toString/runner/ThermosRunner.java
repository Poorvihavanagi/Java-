package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Thermos;

public class ThermosRunner {
    public static void main(String[] args) {
        Thermos thermos = new Thermos("Milton", 750, "Blue");
        System.out.println(thermos);

        int hash = thermos.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(thermos));
    }
}
