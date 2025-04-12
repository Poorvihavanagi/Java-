package com.xworkz.toString.runner;

import com.xworkz.toString.internal.HairDryer;

public class HairDryerRunner {
    public static void main(String[] args) {
        HairDryer dryer = new HairDryer("Philips", 1200, "Black");
        System.out.println(dryer);

        int hash = dryer.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(dryer));

        HairDryer dryer1 = new HairDryer("Philips", 1200, "Black");
        HairDryer dryer2 = new HairDryer("Philips", 1100, "Black");

        System.out.println("Checking same location: " + (dryer1 == dryer2));
        boolean same = dryer1.equals(dryer2);
        System.out.println("Dryer1 is same as Dryer2: " + same);

    }
}
