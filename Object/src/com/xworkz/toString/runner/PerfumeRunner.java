
package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume = new Perfume("Citrus", "Dior", 100);
        System.out.println(perfume);

        int hash = perfume.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(perfume));

        Perfume perfume1 = new Perfume("Woody", "Chanel", 150);
        Perfume perfume2 = new Perfume("Woody", "Chanel", 150);

        System.out.println("Checking same location: " + (perfume1 == perfume2));
        boolean same = perfume1.equals(perfume2);
        System.out.println("Perfume1 is same as Perfume2: " + same);
    }
}
