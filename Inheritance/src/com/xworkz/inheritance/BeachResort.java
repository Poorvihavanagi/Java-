package com.xworkz.inheritance;

public class BeachResort extends Resort {

    @Override
    public void bookRoom() {
        super.bookRoom();
        System.out.println("Running bookRoom in Beach Resort");
    }

    @Override
    public void serveFood() {
        super.serveFood();
        System.out.println("Running serveFood in Beach Resort");
    }

    @Override
    public void provideEntertainment() {
        super.provideEntertainment();
        System.out.println("Running provideEntertainment in Beach Resort");
    }

    @Override
    public void offerSpaServices() {
        super.offerSpaServices();
        System.out.println("Running offerSpaServices in Beach Resort");
    }

    @Override
    public void maintainHygiene() {
        super.maintainHygiene();
        System.out.println("Running maintainHygiene in Beach Resort");
    }

    public void setupBonfire() {
        System.out.println("Running setup bonfire in beach resort");
    }
}
