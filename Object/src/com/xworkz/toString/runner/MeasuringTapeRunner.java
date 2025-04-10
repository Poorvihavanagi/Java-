package com.xworkz.toString.runner;
import com.xworkz.toString.internal.MeasuringTape;

public class MeasuringTapeRunner {
    public static void main(String[] args) {
        MeasuringTape tape = new MeasuringTape("Stanley", 5, "m");
        System.out.println(tape);

        int hash = tape.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tape));
    }
}