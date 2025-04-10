package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Clothing;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing cloth = new Clothing("H&M", "T-Shirt", 759.99);
        System.out.println(cloth);

        int hash = cloth.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cloth));
    }
}
