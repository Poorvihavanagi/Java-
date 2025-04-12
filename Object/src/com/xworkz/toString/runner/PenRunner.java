package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen("Reynolds", "Blue", 10.5);
        System.out.println(pen);

        int hash = pen.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(pen));

        Pen pen1 = new Pen("Reynolds", "Black", 10.5);
        Pen pen2 = new Pen("Reynolds", "Black", 45.0);

        System.out.println("Checking same location: " + (pen1 == pen2));
        boolean same = pen1.equals(pen2);
        System.out.println("Pen1 is same as Pen2: " + same);
    }
}
