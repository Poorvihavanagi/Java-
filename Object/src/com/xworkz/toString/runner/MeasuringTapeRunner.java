package com.xworkz.toString.runner;
import com.xworkz.toString.internal.MeasuringTape;

public class MeasuringTapeRunner {
    public static void main(String[] args) {
        MeasuringTape tape = new MeasuringTape("Stanley", 5, "m");
        System.out.println(tape);

        int hash = tape.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(tape));

        MeasuringTape tape1 = new MeasuringTape("Stanley", 5, "m");
        MeasuringTape tape2 = new MeasuringTape("Bosch", 3, "ft");

        System.out.println("Checking same location: " + (tape1 == tape2));
        boolean same = tape1.equals(tape2);
        System.out.println("Tape1 is same as Tape2: " + same);
    }
}