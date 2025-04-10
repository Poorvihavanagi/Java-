package com.xworkz.toString.runner;
import com.xworkz.toString.internal.WashingPowder;

public class WashingPowderRunner {
    public static void main(String[] args) {
        WashingPowder powder = new WashingPowder("Surf Excel", 1000, "Jasmine");
        System.out.println(powder);

        int hash = powder.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(powder));
    }
}
