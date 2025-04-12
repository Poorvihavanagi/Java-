package com.xworkz.toString.runner;
import com.xworkz.toString.internal.SewingMachine;

public class SewingMachineRunner {
    public static void main(String[] args) {
        SewingMachine machine = new SewingMachine("Singer", "Zigzag", 90);
        System.out.println(machine);

        int hash = machine.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(machine));

        SewingMachine machine1 = new SewingMachine("Singer", "Zigzag", 90);
        SewingMachine machine2 = new SewingMachine("Singer", "Zigzag", 100);

        System.out.println("Checking same location: " + (machine1 == machine2));
        boolean same = machine1.equals(machine2);
        System.out.println("Machine1 is same as Machine2: " + same);
    }
}