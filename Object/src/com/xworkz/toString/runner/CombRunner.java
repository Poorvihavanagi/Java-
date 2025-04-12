package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Comb;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb = new Comb("Wide-Tooth", "Plastic", 25);
        System.out.println(comb);

        int hash = comb.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(comb));

        Comb comb1 = new Comb("Wide-Tooth", "Plastic", 25);
        Comb comb2 = new Comb("Wide-Tooth", "Wood", 30);

        System.out.println("Checking same location: " + (comb1 == comb2));
        boolean same = comb1.equals(comb2);
        System.out.println("Comb1 is same as Comb2: " + same);

    }
}
