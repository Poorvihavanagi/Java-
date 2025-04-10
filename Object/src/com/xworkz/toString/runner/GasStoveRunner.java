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
    }
}
