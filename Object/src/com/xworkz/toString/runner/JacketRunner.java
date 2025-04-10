package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Jacket;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("Leather", "M", "Zipper");
        System.out.println(jacket);

        int hash = jacket.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(jacket));
    }
}
