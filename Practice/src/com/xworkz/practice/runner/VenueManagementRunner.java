package com.xworkz.practice.runner;

import com.xworkz.practice.external.EventVenue;
import com.xworkz.practice.internal.RoyalEventVenueImpl;
import com.xworkz.practice.internal.VenueManagement;

public class VenueManagementRunner {
    public static void main(String[] args) {
        VenueManagement venueManagement=new RoyalEventVenueImpl();
        EventVenue eventVenue=new EventVenue(venueManagement);
        eventVenue.eventDate();
    }
}
