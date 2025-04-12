package com.xworkz.toString.runner;

import com.xworkz.toString.internal.NailCutter;

public class NailCutterRunner {
    public static void main(String[] args) {
        NailCutter cutter = new NailCutter("Tension Coil", "Very Sharp", true);
        System.out.println(cutter);

        int hash = cutter.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cutter));

        NailCutter cutter1 = new NailCutter("Tension Coil", "Very Sharp", true);
        NailCutter cutter2 = new NailCutter("Flat Spring", "Moderate", false);

        System.out.println("Checking same location: " + (cutter1 == cutter2));
        boolean same = cutter1.equals(cutter2);
        System.out.println("Cutter1 is same as Cutter2: " + same);
    }
}
