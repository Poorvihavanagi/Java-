package com.xworkz.toString.runner;
import com.xworkz.toString.internal.DishRack;

public class DishRackRunner {
    public static void main(String[] args) {
        DishRack rack = new DishRack(2, "Stainless Steel", "Silver");
        System.out.println(rack);

        int hash = rack.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(rack));
    }
}