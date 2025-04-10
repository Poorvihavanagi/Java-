package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Comb;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb = new Comb("Wide-Tooth", "Plastic", 25);
        System.out.println(comb);

        int hash = comb.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(comb));
    }
}
