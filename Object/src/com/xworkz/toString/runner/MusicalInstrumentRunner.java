package com.xworkz.toString.runner;

import com.xworkz.toString.internal.MusicalInstrument;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument instrument = new MusicalInstrument("Tabla", "Percussion", 2999.00);
        System.out.println(instrument);

        int hash = instrument.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(instrument));

        MusicalInstrument instrument1 = new MusicalInstrument("Tabla", "Percussion", 2999.00);
        MusicalInstrument instrument2 = new MusicalInstrument("Guitar", "String", 4999.00);

        System.out.println("Checking same location: " + (instrument1 == instrument2));
        boolean same = instrument1.equals(instrument2);
        System.out.println("Instrument1 is same as Instrument2: " + same);
    }
}
