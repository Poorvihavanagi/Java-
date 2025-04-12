package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Jacket;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("Leather", "M", "Zipper");
        System.out.println(jacket);

        int hash = jacket.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(jacket));

        Jacket jacket1 = new Jacket("Leather", "M", "Zipper");
        Jacket jacket2 = new Jacket("Leather", "M", "Button");

        System.out.println("Checking same location: " + (jacket1 == jacket2));
        boolean same = jacket1.equals(jacket2);
        System.out.println("Jacket1 is same as Jacket2: " + same);
    }
}
