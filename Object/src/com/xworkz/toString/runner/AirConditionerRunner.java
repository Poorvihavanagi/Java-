package com.xworkz.toString.runner;

import com.xworkz.toString.internal.AirConditioner;

public class AirConditionerRunner {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner("Daikin", 1.5, "Inverter");
        System.out.println(ac);

        int code=ac.hashCode();
        System.out.println("Code: " +code);

        System.out.println(new AirConditioner("Daikin", 1.5, "Inverter").hashCode());

        AirConditioner airConditioner1=new AirConditioner("LG", 2.5, "Inverter");


        AirConditioner airConditioner2=new AirConditioner("LG", 1.5, "Inverter");


        System.out.println("Checking same location: " +(airConditioner1==airConditioner2));
        Boolean same=airConditioner2.equals(airConditioner1);
        System.out.println("AC1 is same as AC2: " +same);
    }
}
