package com.xworkz.implement;

import com.xworkz.internal.Cement;

public class ConcreteCement implements Cement {
    public void mixWithWater() {
        System.out.println("Mixing cement with water to create concrete.");
    }

    public void pour() {
        System.out.println("Pouring the cement mixture into molds.");
    }

    public void dry() {
        System.out.println("Allowing the cement to dry and set.");
    }
    @Override
    public void setTimer() {
        System.out.println("Setting timer for the concrete to dry.");
    }

    @Override
    public void checkConsistency() {
        System.out.println("Checking the consistency of the concrete mixture.");
    }
}
