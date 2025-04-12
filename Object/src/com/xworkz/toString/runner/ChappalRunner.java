package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Chappal;

public class ChappalRunner {
    public static void main(String[] args) {
        Chappal chappal = new Chappal("Bata", "9", "Rubber");
        System.out.println(chappal);

        int hash = chappal.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(chappal));

        Chappal chappal2 = new Chappal("Bata", "9", "Leather");
        System.out.println("Checking same location: " + (chappal == chappal2));
        boolean same = chappal.equals(chappal2);
        System.out.println("Chappal1 is same as Chappal2: " + same);

    }
}