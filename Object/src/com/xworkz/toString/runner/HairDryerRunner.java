package com.xworkz.toString.runner;

import com.xworkz.toString.internal.HairDryer;

public class HairDryerRunner {
    public static void main(String[] args) {
        HairDryer dryer = new HairDryer("Philips", 1200, "Black");
        System.out.println(dryer);

        int hash = dryer.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(dryer));
    }
}
