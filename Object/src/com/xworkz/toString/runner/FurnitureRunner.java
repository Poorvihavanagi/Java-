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

        Furniture furniture1 = new Furniture("Dining Table", "Sheesham Wood", 18999.99);
        Furniture furniture2 = new Furniture("Sofa", "Leather", 24999.99);

        System.out.println("Checking same location: " + (furniture1 == furniture2));
        boolean same = furniture1.equals(furniture2);
        System.out.println("Furniture1 is same as Furniture2: " + same);
    }
}
