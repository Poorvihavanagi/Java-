package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Charger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger = new Charger("Type-C", 33, "Realme");
        System.out.println(charger);

        int hash = charger.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(charger));

        Charger charger2 = new Charger("Type-C", 33, "Realme");
        System.out.println("Checking same location: " + (charger == charger2));
        boolean same = charger.equals(charger2);
        System.out.println("Charger1 is same as Charger2: " + same);
    }

}
