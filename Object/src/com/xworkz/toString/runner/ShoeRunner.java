package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 9, "Black");
        System.out.println(shoe);

        int hash = shoe.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(shoe));

        Shoe shoe1 = new Shoe("Nike", 9, "Black");
        Shoe shoe2 = new Shoe("Nike", 9, "Black");

        System.out.println("Checking same location: " + (shoe1 == shoe2));
        boolean same = shoe1.equals(shoe2);
        System.out.println("Shoe1 is same as Shoe2: " + same);
    }
}
