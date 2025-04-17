package com.xworkz.runner;

import com.xworkz.internal.Travel;
import com.xworkz.implement.InternationalTravel;

public class TravelRunner {
    public static void main(String[] args) {
        Travel travel = new InternationalTravel();
        travel.bookTickets();
        travel.packLuggage();
        travel.startJourney();

        travel.arrangeAccommodation();
        travel.prepareItinerary();
    }
}
