package com.xworkz.inheritance;

public class Laptop extends Computer {

    @Override
    public void process() {
        super.process();
        System.out.println("Running process in laptop...");
    }

    @Override
    public void storeData() {
        super.storeData();
        System.out.println("Running store Data in laptop...");
    }

    @Override
    public void connectToInternet() {
        super.connectToInternet();
        System.out.println("Running connect To Internet in laptop...");
    }

    @Override
    public void displayOutput() {
        super.displayOutput();
        System.out.println("Running display Output in laptop...");
    }

    @Override
    public void runSoftware() {
        super.runSoftware();
        System.out.println("Running run Software in laptop...");
    }
}
