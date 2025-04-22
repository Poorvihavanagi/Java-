package com.xworkz.practice.runner;

import com.xworkz.practice.external.EventManagement;
import com.xworkz.practice.internal.BigEventOrganizerImpl;
import com.xworkz.practice.internal.EventOrganizer;

public class EventOrganizerRunner {
    public static void main(String[] args) {
        EventOrganizer eventOrganizer=new BigEventOrganizerImpl();
        EventManagement eventManagement=new EventManagement(eventOrganizer);
        eventManagement.manageGuestList();
    }
}
