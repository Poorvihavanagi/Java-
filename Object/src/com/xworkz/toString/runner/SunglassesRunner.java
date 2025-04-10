package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Sunglasses;

public class SunglassesRunner {
    public static void main(String[] args) {
        Sunglasses sunglasses = new Sunglasses("Metal", "Black", "UV400");
        System.out.println(sunglasses);

        int hash = sunglasses.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sunglasses));
    }
}
