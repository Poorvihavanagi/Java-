package com.xworkz.inheritance;

public class Coin extends Currency {
    public void printValue() {
        super.printValue();
        System.out.println("Displaying the coin's value...");
    }

    public void checkAuthenticity() {
        super.checkAuthenticity();
        System.out.println("Checking if the coin is genuine...");
    }

    public void exchange() {
        super.exchange();
        System.out.println("Exchanging the coin for other denominations...");
    }

    public void useForPayment() {
        super.useForPayment();
        System.out.println("Using a coin for small transactions...");
    }

    public void collect() {
        super.collect();
        System.out.println("Collecting rare and antique coins...");
    }
}
