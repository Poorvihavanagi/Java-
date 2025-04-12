package com.xworkz.toString.runner;
import com.xworkz.toString.internal.DishRack;

public class DishRackRunner {
    public static void main(String[] args) {
        DishRack rack = new DishRack(2, "Stainless Steel", "Silver");
        System.out.println(rack);

        int hash = rack.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(rack));

        DishRack rack1 = new DishRack(2, "Stainless Steel", "Silver");
        DishRack rack2 = new DishRack(2, "Wood", "Brown");

        System.out.println("Checking same location: " + (rack1 == rack2));
        boolean same = rack1.equals(rack2);
        System.out.println("Rack1 is same as Rack2: " + same);

    }
}