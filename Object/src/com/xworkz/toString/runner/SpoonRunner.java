package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Spoon;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon spoon = new Spoon("Steel", "Tea Spoon", 12);
        System.out.println(spoon);

        int hash = spoon.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(spoon));

        Spoon spoon1 = new Spoon("Steel", "Tea Spoon", 12);
        Spoon spoon2 = new Spoon("Steel", "Tea Spoon", 9);
        System.out.println("Checking same location: " + (spoon1 == spoon2));
        boolean same = spoon1.equals(spoon2);
        System.out.println("Spoon1 is same as Spoon2: " + same);
    }
}
