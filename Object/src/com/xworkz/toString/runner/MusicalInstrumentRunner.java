package com.xworkz.toString.runner;

import com.xworkz.toString.internal.MusicalInstrument;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument instrument = new MusicalInstrument("Tabla", "Percussion", 2999.00);
        System.out.println(instrument);

        int hash = instrument.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(instrument));
    }
}
