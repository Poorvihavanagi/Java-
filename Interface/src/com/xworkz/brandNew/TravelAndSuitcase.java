package com.xworkz.brandNew;

import com.xworkz.internal.Travel;
import com.xworkz.internal.Suitcase;

public class TravelAndSuitcase implements Travel, Suitcase {

    @Override
    public void bookTickets() {
        System.out.println("Booking tickets for the journey.");
    }

    @Override
    public void packLuggage() {
        System.out.println("Packing luggage for the trip.");
    }

    @Override
    public void startJourney() {
        System.out.println("Starting the journey.");
    }

    @Override
    public void packItems() {
        System.out.println("Packing items into the suitcase.");
    }

    @Override
    public void roll() {
        System.out.println("Rolling the suitcase.");
    }

    @Override
    public void openSuitcase() {
        System.out.println("Opening the suitcase.");
    }
}
