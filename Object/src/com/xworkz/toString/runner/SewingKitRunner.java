package com.xworkz.toString.runner;
import com.xworkz.toString.internal.SewingKit;

public class SewingKitRunner {
    public static void main(String[] args) {
        SewingKit kit = new SewingKit(20, "Zipper", "Home Repair");
        System.out.println(kit);

        int hash = kit.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(kit));

        SewingKit kit1 = new SewingKit(20, "Zipper", "Home Repair");
        SewingKit kit2 = new SewingKit(20, "Zipper", "Home Repair");

        System.out.println("Checking same location: " + (kit1 == kit2));
        boolean same = kit1.equals(kit2);
        System.out.println("Kit1 is same as Kit2: " + same);
    }
}