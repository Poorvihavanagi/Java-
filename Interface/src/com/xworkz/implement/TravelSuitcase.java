package com.xworkz.implement;

import com.xworkz.internal.Suitcase;

public class TravelSuitcase implements Suitcase {
    public void packItems() {
        System.out.println("Packing clothes and essentials into the suitcase.");
    }

    public void roll() {
        System.out.println("Rolling the suitcase through the airport.");
    }

    public void openSuitcase() {
        System.out.println("Opening the suitcase after arriving at destination.");
    }
}
