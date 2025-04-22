package com.xworkz.practice.internal;

public class BookMyShowTicketImpl implements TicketingSystem{
    @Override
    public void issueTicket() {
        System.out.println("Running issue ticket in book my show");
    }
}
