package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Charger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger = new Charger("Type-C", 33, "Realme");
        System.out.println(charger);
    }
}
