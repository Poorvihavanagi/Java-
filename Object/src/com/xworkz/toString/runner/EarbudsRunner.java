package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Earbuds;

public class EarbudsRunner {
    public static void main(String[] args) {
        Earbuds earbuds = new Earbuds("boAt", 24, "Active");
        System.out.println(earbuds);

        int hash = earbuds.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(earbuds));

        Earbuds earbuds1 = new Earbuds("boAt", 24, "Active");
        Earbuds earbuds2 = new Earbuds("Sony", 20, "Passive");

        System.out.println("Checking same location: " + (earbuds1 == earbuds2));
        boolean same = earbuds1.equals(earbuds2);
        System.out.println("Earbuds1 is same as Earbuds2: " + same);
    }
}
