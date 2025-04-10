package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Shoe;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 9, "Black");
        System.out.println(shoe);

        int hash = shoe.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(shoe));
    }
}
