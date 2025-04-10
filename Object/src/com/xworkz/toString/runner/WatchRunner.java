package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("Fossil", "Analog", 5499.99);
        System.out.println(watch);
        int hash = watch.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(watch));
    }
}