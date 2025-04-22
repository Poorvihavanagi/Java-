package com.xworkz.practice.external;

import com.xworkz.practice.internal.TicketingSystem;

public class OnlineTicketingApp {
    private TicketingSystem ticketingSystem;

    public OnlineTicketingApp(TicketingSystem ticketingSystem){
        this.ticketingSystem=ticketingSystem;
        System.out.println("Parameterized const online ticket app");
    }

    public void sellTicket(){
        if(this.ticketingSystem!=null){
            this.ticketingSystem.issueTicket();
            System.out.println("Ticketing system is not null");
        }
        else{
            System.out.println("It is null");
        }
    }
}
