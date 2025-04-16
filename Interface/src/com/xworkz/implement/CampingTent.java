package com.xworkz.implement;

import com.xworkz.internal.Tent;

public class CampingTent implements Tent {
    public void setUp() {
        System.out.println("Setting up the camping tent.");
    }

    public void occupy() {
        System.out.println("Occupying the camping tent.");
    }

    public void packUp() {
        System.out.println("Packing up the camping tent.");
    }
}
