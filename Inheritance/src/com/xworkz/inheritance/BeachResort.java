package com.xworkz.inheritance;

public class BeachResort extends Resort {

    @Override
    public void bookRoom() {
        super.bookRoom();
        System.out.println("Running bookRoom in BeachResort");
    }

    @Override
    public void serveFood() {
        super.serveFood();
        System.out.println("Running serveFood in BeachResort");
    }

    @Override
    public void provideEntertainment() {
        super.provideEntertainment();
        System.out.println("Running provideEntertainment in BeachResort");
    }

    @Override
    public void offerSpaServices() {
        super.offerSpaServices();
        System.out.println("Running offerSpaServices in BeachResort");
    }

    @Override
    public void maintainHygiene() {
        super.maintainHygiene();
        System.out.println("Running maintainHygiene in BeachResort");
    }
}
