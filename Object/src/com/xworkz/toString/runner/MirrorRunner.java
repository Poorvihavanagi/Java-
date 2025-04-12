package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new Mirror("Oval", 24.5, true);
        System.out.println(mirror);

        int hash = mirror.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(mirror));

        Mirror mirror1 = new Mirror("Oval", 24.5, true);
        Mirror mirror2 = new Mirror("Round", 18.0, false);

        System.out.println("Checking same location: " + (mirror1 == mirror2));
        boolean same = mirror1.equals(mirror2);
        System.out.println("Mirror1 is same as Mirror2: " + same);
    }
}
