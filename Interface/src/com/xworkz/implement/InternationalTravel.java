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
}
