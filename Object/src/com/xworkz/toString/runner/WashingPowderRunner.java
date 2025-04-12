package com.xworkz.toString.runner;
import com.xworkz.toString.internal.WashingPowder;

public class WashingPowderRunner {
    public static void main(String[] args) {
        WashingPowder powder = new WashingPowder("Surf Excel", 1000, "Jasmine");
        System.out.println(powder);

        int hash = powder.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(powder));

        WashingPowder powder1 = new WashingPowder("Surf Excel", 1000, "Jasmine");
        WashingPowder powder2 = new WashingPowder("Ariel", 1500, "Lavender");

        System.out.println("Checking same location: " + (powder1 == powder2));
        boolean same = powder1.equals(powder2);
        System.out.println("Powder1 is same as Powder2: " + same);
    }
}
