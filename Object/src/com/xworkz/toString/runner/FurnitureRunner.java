package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Furniture;

public class FurnitureRunner
{
    public static void main(String[] args) {
        Furniture furniture = new Furniture("Dining Table", "Sheesham Wood", 18999.99);
        System.out.println(furniture);

        int hash = furniture.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(furniture));
    }
}
