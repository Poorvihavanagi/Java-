package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Heater;

public class HeaterRunner
{
    public static void main(String[] args) {
        Heater heater = new Heater("Usha", 2000, "Knob");
        System.out.println(heater);

        int hash = heater.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(heater));

        Heater heater1 = new Heater("Usha", 2000, "Knob");
        Heater heater2 = new Heater("Bajaj", 2000, "Remote");

        System.out.println("Checking same location: " + (heater1 == heater2));
        boolean same = heater1.equals(heater2);
        System.out.println("Heater1 is same as Heater2: " + same);
    }
}
