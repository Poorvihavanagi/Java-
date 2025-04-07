package com.xworkz.inheritance;

public class HillResort extends Resort{
    public void setupBonfire(){
        System.out.println("Setting up bonfire at the beach for guests");
    }
    public void arrangeTrekking(Resort resort){
        resort.bookRoom();
        resort.maintainHygiene();
        resort.offerSpaServices();
        resort.serveFood();
        resort.provideEntertainment();

        if(resort instanceof HillResort){
            System.out.println("Resort is an instance of hill resort");
            HillResort hillResort=(HillResort) resort;
            hillResort.setupBonfire();
        }
    }
}
