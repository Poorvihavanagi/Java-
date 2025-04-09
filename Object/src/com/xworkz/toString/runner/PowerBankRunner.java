package com.xworkz.toString.runner;

import com.xworkz.toString.internal.PowerBank;

public class PowerBankRunner {
    public static void main(String[] args) {
        PowerBank pb = new PowerBank("Mi", 10000, 2);
        System.out.println(pb);
    }
}
