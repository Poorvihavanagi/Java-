package com.xworkz.practice.external;

import com.xworkz.practice.internal.VenueManagement;

public class EventVenue {
    private VenueManagement venueManagement;

    public EventVenue(VenueManagement venueManagement){
        this.venueManagement=venueManagement;
        System.out.println("Parameterized const");
    }
    public void eventDate(){
        if(this.venueManagement!=null){
            this.venueManagement.bookEvent();
            System.out.println("Not null venue management");
        }
        else{
            System.out.println("It is null");
        }
    }
}
