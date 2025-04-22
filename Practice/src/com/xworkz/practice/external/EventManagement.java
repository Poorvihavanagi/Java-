package com.xworkz.practice.external;

import com.xworkz.practice.internal.EventOrganizer;

public class EventManagement {
    private EventOrganizer eventOrganizer;

    public EventManagement(EventOrganizer eventOrganizer){
        this.eventOrganizer=eventOrganizer;
        System.out.println("Paramterized const");
    }
    public void manageGuestList(){
        if(this.eventOrganizer!=null){
            System.out.println("Event organizer is not null");
            this.eventOrganizer.scheduleEvent();
        }
        else{
            System.out.println("It is null");
        }
    }
}
