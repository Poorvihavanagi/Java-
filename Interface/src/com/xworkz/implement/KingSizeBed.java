package com.xworkz.implement;

import com.xworkz.internal.Bed;

public class KingSizeBed implements Bed {
    public void makeBed() {
        System.out.println("Making the king-size bed.");
    }

    public void sleep() {
        System.out.println("Sleeping on the king-size bed.");
    }

    public void cleanBed() {
        System.out.println("Cleaning the king-size bed.");
    }
}
