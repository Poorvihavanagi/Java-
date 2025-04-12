package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella(8, "High", "Auto-Open");
        System.out.println(umbrella);

        int hash = umbrella.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(umbrella));
        Umbrella umbrella1 = new Umbrella(8, "High", "Auto-Open");
        Umbrella umbrella2 = new Umbrella(8, "High", "Manual");

        System.out.println("Checking same location: " + (umbrella1 == umbrella2));
        boolean same = umbrella1.equals(umbrella2);
        System.out.println("Umbrella1 is same as Umbrella2: " + same);
    }
}
