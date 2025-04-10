package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Steel", 750, "Milton");
        System.out.println(bottle);

        int hash = bottle.hashCode();
        System.out.println(new Bottle("Plastic", 1000, "Cello").hashCode());
    }
}