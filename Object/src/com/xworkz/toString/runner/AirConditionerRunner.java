package com.xworkz.toString.runner;

import com.xworkz.toString.internal.AirConditioner;

public class AirConditionerRunner {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner("Daikin", 1.5, "Inverter");
        System.out.println(ac);

        int code=ac.hashCode();
        System.out.println("Code: " +code);

        System.out.println(new AirConditioner("Daikin", 1.5, "Inverter").hashCode());
    }
}
