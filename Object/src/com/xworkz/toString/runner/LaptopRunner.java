package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", "i5", 16);
        System.out.println(laptop);

        int hash = laptop.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(laptop));
    }
}