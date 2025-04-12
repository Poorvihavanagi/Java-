package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Jug;

public class JugRunner {
    public static void main(String[] args) {
        Jug jug = new Jug("Floral Print", "Plastic", true);
        System.out.println(jug);

        int hash = jug.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(jug));

        Jug jug1 = new Jug("Floral Print", "Plastic", true);
        Jug jug2 = new Jug("Solid", "Glass", false);

        System.out.println("Checking same location: " + (jug1 == jug2));
        boolean same = jug1.equals(jug2);
        System.out.println("Jug1 is same as Jug2: " + same);
    }
}
