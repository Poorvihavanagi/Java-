package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Cushion;

public class CushionRunner {
    public static void main(String[] args) {
        Cushion cushion = new Cushion("Yellow", "Square", "Cotton");
        System.out.println(cushion);

        int hash = cushion.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(cushion));
    }
}
