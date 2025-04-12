package com.xworkz.toString.runner;

import com.xworkz.toString.internal.PowerBank;

public class PowerBankRunner {
    public static void main(String[] args) {
        PowerBank pb = new PowerBank("Mi", 10000, 2);
        System.out.println(pb);

        int hash = pb.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(pb));

        PowerBank pb1 = new PowerBank("Realme", 20000, 3);
        PowerBank pb2 = new PowerBank("Realme", 20000, 2);

        System.out.println("Checking same location: " + (pb1 == pb2));
        boolean same = pb1.equals(pb2);
        System.out.println("PowerBank1 is same as PowerBank2: " + same);
    }
}
