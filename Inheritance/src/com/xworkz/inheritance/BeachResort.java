package com.xworkz.inheritance;

public class BeachResort extends Resort {
    public void bookRoom() {
        super.bookRoom();
        System.out.println("Beach Resort offers sea-facing cottages...");
    }

    public void serveFood() {
        super.serveFood();
        System.out.println("Beach Resort serves fresh seafood and tropical drinks...");
    }

    public void provideEntertainment() {
        super.provideEntertainment();
        System.out.println("Beach Resort provides water sports and sunset cruises...");
    }
    public void offerSpaServices() {
        super.offerSpaServices();
        System.out.println("Beach Resort offers beachfront spa treatments...");
    }
    public void maintainHygiene() {
        super.maintainHygiene();
        System.out.println("Beach Resort ensures cleanliness and eco-friendly practices...");
    }
}
