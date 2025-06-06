package com.xworkz.implement;

import com.xworkz.internal.Travel;

public class InternationalTravel implements Travel {
    public void bookTickets() {
        System.out.println("Booking international flight tickets.");
    }

    public void packLuggage() {
        System.out.println("Packing luggage with passport and essentials.");
    }

    public void startJourney() {
        System.out.println("Starting international travel journey.");
    }
    @Override
    public void arrangeAccommodation() {
        System.out.println("Arranging accommodation at a five-star hotel.");
    }

    @Override
    public void prepareItinerary() {
        System.out.println("Preparing detailed itinerary for the trip.");
    }
}
