package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Pen;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen("Reynolds", "Blue", 10.5);
        System.out.println(pen);

        int hash = pen.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(pen));
    }
}
