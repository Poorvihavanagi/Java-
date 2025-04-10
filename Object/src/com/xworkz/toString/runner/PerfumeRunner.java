
package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Perfume;

public class PerfumeRunner {
    public static void main(String[] args) {
        Perfume perfume = new Perfume("Citrus", "Dior", 100);
        System.out.println(perfume);

        int hash = perfume.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(perfume));
    }
}
