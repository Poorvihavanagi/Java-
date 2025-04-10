package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("Cotton", "Large", "Blue");
        System.out.println(towel);

        int hash = towel.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(towel));
    }
}