package com.xworkz.internal;

public interface Travel {
    void bookTickets();
    void packLuggage();
    void startJourney();
    default void arrangeAccommodation() {
        System.out.println("Arranging accommodation for the journey.");
    }

    default void prepareItinerary() {
        System.out.println("Preparing travel itinerary.");
    }
}
