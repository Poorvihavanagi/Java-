package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new Mirror("Oval", 24.5, true);
        System.out.println(mirror);

        int hash = mirror.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(mirror));
    }
}
