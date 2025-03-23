package com.xworkz.classesAsInstanceVariable;

public class Virat
{
    Ticket ticket;
    Brush brush;
    Cricket cricket;
    Clip[] clips;

    Virat(Ticket ticket, Brush brush, Cricket cricket, Clip[] clips){
        this.ticket=ticket;
        this.brush=brush;
        this.cricket=cricket;
        this.clips=clips;
    }

    void play(){
        System.out.println("Virat is playing");
        cricket.watch();
        cricket.profit();
    }

    void clean(){
        System.out.println("Virat is cleaning");
        brush.clean();
        brush.scrub();
    }

    void relax(){
        System.out.println("virat is relaxing");
        ticket.buy();
        ticket.sell();
    }
}
