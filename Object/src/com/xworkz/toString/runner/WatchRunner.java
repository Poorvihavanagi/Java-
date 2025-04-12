package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Fossil", "Analog", 5499.99);
        System.out.println(watch);
        int hash = watch.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(watch));

        Watch watch1 = new Watch("Fossil", "Digital", 6499.99);
        Watch watch2 = new Watch("Fossil", "Digital", 6499.99);

        System.out.println("Checking same location: " + (watch1 == watch2));
        boolean same = watch1.equals(watch2);
        System.out.println("Watch1 is same as Watch2: " + same);
    }
}