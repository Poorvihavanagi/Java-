package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Steel", 750, "Milton");
        System.out.println(bottle);

        int hash = bottle.hashCode();
        System.out.println(new Bottle("Plastic", 1000, "Cello").hashCode());

        Bottle bottle1 = new Bottle("Steel", 750, "Milton");
        Bottle bottle2 = new Bottle("Plastic", 1000, "Cello");

        System.out.println("Checking same location: " + (bottle1 == bottle2));
        boolean same = bottle2.equals(bottle1);
        System.out.println("Bottle1 is same as Bottle2: " + same);

    }
}