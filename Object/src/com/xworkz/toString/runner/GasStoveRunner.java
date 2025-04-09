package com.xworkz.toString.runner;

import com.xworkz.toString.internal.GasStove;

public class GasStoveRunner
{
    public static void main(String[] args) {
        GasStove stove = new GasStove("Prestige", 3, "Auto Ignition");
        System.out.println(stove);
    }
}
