package com.xworkz.practice.internal;

public class BigEventOrganizerImpl implements EventOrganizer{
    @Override
    public void scheduleEvent() {
        System.out.println("Running schedule event in big event organizer");
    }
}
