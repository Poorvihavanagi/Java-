package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Jug;

public class JugRunner {
    public static void main(String[] args) {
        Jug jug = new Jug("Floral Print", "Plastic", true);
        System.out.println(jug);

        int hash = jug.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(jug));
    }
}
