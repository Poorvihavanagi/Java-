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
    @Override
    public void cleanUp() {
        System.out.println("Cleaning up the camping tent after camping.");
    }

    @Override
    public void store() {
        System.out.println("Storing the camping tent in the storage area.");
    }
}
