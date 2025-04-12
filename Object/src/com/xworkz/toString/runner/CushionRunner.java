package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Cushion;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion cushion = new Cushion("Yellow", "Square", "Cotton");
        System.out.println(cushion);

        int hash = cushion.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cushion));

        Cushion cushion1 = new Cushion("Yellow", "Square", "Cotton");
        Cushion cushion2 = new Cushion("Yellow", "Round", "Velvet");

        System.out.println("Checking same location: " + (cushion1 == cushion2));
        boolean same = cushion1.equals(cushion2);
        System.out.println("Cushion1 is same as Cushion2: " + same);

    }
}
