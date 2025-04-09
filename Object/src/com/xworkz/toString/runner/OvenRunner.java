package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Oven;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Oven("OVN-9001", true, 1200);
        System.out.println(oven);
    }
}
