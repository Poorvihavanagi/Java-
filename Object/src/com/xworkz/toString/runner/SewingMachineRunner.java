package com.xworkz.toString.runner;
import com.xworkz.toString.internal.SewingMachine;

public class SewingMachineRunner {
    public static void main(String[] args) {
        SewingMachine machine = new SewingMachine("Singer", "Zigzag", 90);
        System.out.println(machine);
    }
}