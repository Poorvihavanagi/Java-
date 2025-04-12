package com.xworkz.toString.runner;

import com.xworkz.toString.internal.GasStove;

public class GasStoveRunner
{
    public static void main(String[] args) {
        GasStove stove = new GasStove("Prestige", 3, "Auto Ignition");
        System.out.println(stove);

        int hash = stove.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(stove));

        GasStove stove1 = new GasStove("Prestige", 3, "Auto Ignition");
        GasStove stove2 = new GasStove("Bajaj", 4, "Manual Ignition");

        System.out.println("Checking same location: " + (stove1 == stove2));
        boolean same = stove1.equals(stove2);
        System.out.println("Stove1 is same as Stove2: " + same);
    }
}
