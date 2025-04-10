package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Spoon;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon spoon = new Spoon("Steel", "Tea Spoon", 12);
        System.out.println(spoon);

        int hash = spoon.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(spoon));
    }
}
