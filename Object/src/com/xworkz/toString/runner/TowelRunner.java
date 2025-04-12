package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("Cotton", "Large", "Blue");
        System.out.println(towel);

        int hash = towel.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(towel));

        Towel towel1 = new Towel("Cotton", "Large", "Blue");
        Towel towel2 = new Towel("Cotton", "Large", "Blue");

        System.out.println("Checking same location: " + (towel1 == towel2));
        boolean same = towel1.equals(towel2);
        System.out.println("Towel1 is same as Towel2: " + same);
    }
}