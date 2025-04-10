package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Key;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key("SC123", "Front Door", "Cylinder");
        System.out.println(key);

        int hash = key.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(key));
    }
}
