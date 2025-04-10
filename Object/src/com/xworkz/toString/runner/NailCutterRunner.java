package com.xworkz.toString.runner;

import com.xworkz.toString.internal.NailCutter;

public class NailCutterRunner {
    public static void main(String[] args) {
        NailCutter cutter = new NailCutter("Tension Coil", "Very Sharp", true);
        System.out.println(cutter);

        int hash = cutter.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cutter));
    }
}
