package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Kettle;

public class KettleRunner {
    public static void main(String[] args) {
        Kettle kettle = new Kettle(1.5, "Prestige", "Stainless Steel");
        System.out.println(kettle);
    }
}
