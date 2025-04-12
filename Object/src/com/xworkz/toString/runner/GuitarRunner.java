package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Guitar;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Acoustic", 6, "Yamaha");
        System.out.println(guitar);

        int hash = guitar.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(guitar));

        Guitar guitar1 = new Guitar("Acoustic", 6, "Yamaha");
        Guitar guitar2 = new Guitar("Acoustic", 6, "Yamaha");

        System.out.println("Checking same location: " + (guitar1 == guitar2));
        boolean same = guitar1.equals(guitar2);
        System.out.println("Guitar1 is same as Guitar2: " + same);
    }
}