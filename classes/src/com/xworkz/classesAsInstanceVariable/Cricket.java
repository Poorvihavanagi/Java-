package com.xworkz.classesAsInstanceVariable;

public class Cricket
{
    Ticket ticket;

    Cricket(Ticket ticket) {
        this.ticket = ticket;
    }

    void watch() {
        if (ticket != null) {
            ticket.buy();
            System.out.println("Watching the cricket match.");
        } else {
            System.out.println("No ticket available to watch the match.");
        }
    }

    void profit() {
        if (ticket != null) {
            ticket.sell();
            System.out.println("Selling ticket for profit.");
        } else {
            System.out.println("No ticket available to sell.");
        }
    }
}
