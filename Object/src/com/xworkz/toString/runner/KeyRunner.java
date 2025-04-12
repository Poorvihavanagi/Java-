package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Key;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key("SC123", "Front Door", "Cylinder");
        System.out.println(key);

        int hash = key.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(key));

        Key key1 = new Key("SC123", "Front Door", "Cylinder");
        Key key2 = new Key("SC124", "Back Door", "Keycard");

        System.out.println("Checking same location: " + (key1 == key2));
        boolean same = key1.equals(key2);
        System.out.println("Key1 is same as Key2: " + same);
    }
}
