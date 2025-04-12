package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Micorwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Micorwave microwave = new Micorwave("Samsung", 28, true);
        System.out.println(microwave);

        int hash = microwave.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(microwave));

        Micorwave microwave1 = new Micorwave("Samsung", 28, true);
        Micorwave microwave2 = new Micorwave("LG", 30, false);

        System.out.println("Checking same location: " + (microwave1 == microwave1));
        boolean same = microwave2.equals(microwave1);
        System.out.println("Microwave1 is same as Microwave2: " + same);
    }
}