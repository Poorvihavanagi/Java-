package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Sunglasses;

public class SunglassesRunner {
    public static void main(String[] args) {
        Sunglasses sunglasses = new Sunglasses("Metal", "Black", "UV400");
        System.out.println(sunglasses);

        int hash = sunglasses.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sunglasses));

        Sunglasses sunglasses1 = new Sunglasses("Metal", "Black", "UV400");
        Sunglasses sunglasses2 = new Sunglasses("Metal", "Brown", "UV400");

        System.out.println("Checking same location: " + (sunglasses1 == sunglasses2));
        boolean same = sunglasses1.equals(sunglasses2);
        System.out.println("Sunglasses1 is same as Sunglasses2: " + same);
    }
}
