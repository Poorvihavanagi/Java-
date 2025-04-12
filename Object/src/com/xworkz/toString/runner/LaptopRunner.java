package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", "i5", 16);
        System.out.println(laptop);

        int hash = laptop.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(laptop));

        Laptop laptop1 = new Laptop("HP", "i5", 16);
        Laptop laptop2 = new Laptop("Dell", "i7", 8);

        System.out.println("Checking same location: " + (laptop1 == laptop2));
        boolean same = laptop1.equals(laptop2);
        System.out.println("Laptop1 is same as Laptop2: " + same);
    }
}