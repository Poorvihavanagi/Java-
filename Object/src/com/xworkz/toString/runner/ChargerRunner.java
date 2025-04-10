package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Charger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger = new Charger("Type-C", 33, "Realme");
        System.out.println(charger);

        int hash = charger.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(charger));
    }

}
