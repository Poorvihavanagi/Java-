package com.xworkz.toString.runner;
import com.xworkz.toString.internal.SewingKit;

public class SewingKitRunner {
    public static void main(String[] args) {
        SewingKit kit = new SewingKit(20, "Zipper", "Home Repair");
        System.out.println(kit);

        int hash = kit.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(kit));
    }
}