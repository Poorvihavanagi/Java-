package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Gloves;

public class GlovesRunner {
    public static void main(String[] args) {
        Gloves gloves = new Gloves("Rubber", "Medium", "Kitchen");
        System.out.println(gloves);

        int hash = gloves.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(gloves));

        Gloves gloves1 = new Gloves("Rubber", "Large", "Outdoor");
        Gloves gloves2 = new Gloves("Rubber", "Medium", "Kitchen");

        System.out.println("Checking same location: " + (gloves1 == gloves2));
        boolean same = gloves1.equals(gloves2);
        System.out.println("Gloves1 is same as Gloves2: " + same);
    }
}
