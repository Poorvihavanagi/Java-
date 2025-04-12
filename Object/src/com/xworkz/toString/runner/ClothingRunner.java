package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing cloth = new Clothing("H&M", "T-Shirt", 759.99);
        System.out.println(cloth);

        int hash = cloth.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cloth));

        Clothing cloth1 = new Clothing("H&M", "T-Shirt", 759.99);
        Clothing cloth2 = new Clothing("Nike", "Jacket", 1599.99);

        System.out.println("Checking same location: " + (cloth1 == cloth2));
        boolean same = cloth1.equals(cloth2);
        System.out.println("Cloth1 is same as Cloth2: " + same);
    }
}
