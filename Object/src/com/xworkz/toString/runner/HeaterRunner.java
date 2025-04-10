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
    }
}
