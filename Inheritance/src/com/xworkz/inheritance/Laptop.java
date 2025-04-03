package com.xworkz.inheritance;

public class Laptop extends Computer {

    public void process() {
        super.process();
        System.out.println("The laptop is processing data efficiently...");
    }

    public void storeData() {
        super.storeData();
        System.out.println("The laptop is storing data on an SSD...");
    }

    public void connectToInternet() {
        System.out.println("The laptop is portable and easy to carry...");
    }

    public void displayOutput() {
        System.out.println("The laptop is running on battery power...");
    }

    public void runSoftware() {
        System.out.println("The laptop screen can be folded for compact storage...");
    }
}
