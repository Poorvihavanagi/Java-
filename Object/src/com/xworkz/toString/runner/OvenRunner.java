package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Oven;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Oven("OVN-9001", true, 1200);
        System.out.println(oven);
        int hash = oven.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(oven));

        Oven oven1 = new Oven("OVN-9001", true, 1200);
        Oven oven2 = new Oven("OVN-8000", false, 1000);

        System.out.println("Checking same location: " + (oven1 == oven2));
        boolean same = oven1.equals(oven2);
        System.out.println("Oven1 is same as Oven2: " + same);
    }
}
