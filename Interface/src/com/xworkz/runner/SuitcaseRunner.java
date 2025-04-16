package com.xworkz.runner;

import com.xworkz.internal.Suitcase;
import com.xworkz.implement.TravelSuitcase;

public class SuitcaseRunner {
    public static void main(String[] args) {
        Suitcase suitcase = new TravelSuitcase();
        suitcase.packItems();
        suitcase.roll();
        suitcase.openSuitcase();
    }
}
