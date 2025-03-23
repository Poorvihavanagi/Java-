package com.xworkz.classesAsInstanceVariable;

public class Main
{
    public static void main(String... args){
        Clip[] clips={new Clip(ClipColor.RED), new Clip(ClipColor.GREEN), new Clip(ClipColor.YELLOW), new Clip(ClipColor.BLUE), new Clip(ClipColor.PINK)};

        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);

        Ticket ticket = new Ticket(TicketTypes.VIP, 5000);
        Cricket cricket = new Cricket(ticket);

        Brush brush = new Brush(BrushColor.WHITE);

        Virat virat = new Virat(ticket, brush, cricket, clips);

        System.out.println("-----------------------------------------");
        virat.play();
        System.out.println("-----------------------------------------");
        virat.clean();
        System.out.println("-----------------------------------------");
        virat.relax();
    }
}
