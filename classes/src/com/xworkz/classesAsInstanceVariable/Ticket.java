package com.xworkz.classesAsInstanceVariable;

public class Ticket {
    TicketTypes type;
    double cost;

    Ticket(TicketTypes type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    void buy() {
        System.out.println("Buying a " + type + " ticket for Rs." + cost);
    }

    void sell() {
        System.out.println("Selling a " + type + " ticket for Rs." + cost);
    }
}
