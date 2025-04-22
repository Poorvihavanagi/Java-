package com.xworkz.practice.runner;

import com.xworkz.practice.external.OnlineTicketingApp;
import com.xworkz.practice.internal.BookMyShowTicketImpl;
import com.xworkz.practice.internal.TicketingSystem;

public class TicketingSystemRunner {
    public static void main(String[] args) {
        TicketingSystem ticketingSystem=new BookMyShowTicketImpl();
        OnlineTicketingApp onlineTicketingApp=new OnlineTicketingApp(ticketingSystem);
        onlineTicketingApp.sellTicket();
    }
}
