package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Gloves;

public class GlovesRunner {
    public static void main(String[] args) {
        Gloves gloves = new Gloves("Rubber", "Medium", "Kitchen");
        System.out.println(gloves);

        int hash = gloves.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(gloves));
    }
}
