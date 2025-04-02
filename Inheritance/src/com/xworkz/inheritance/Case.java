package com.xworkz.inheritance;

public class Case extends Wallet
{
    public void open() {
        super.open();
        System.out.println("Opening the wallet case...");
    }

    public void close() {
        super.close();
        System.out.println("Closing the wallet case...");
    }

    public void storeMoney() {
        super.storeMoney();
        System.out.println("Storing money securely in the wallet case...");
    }

    public void checkCapacity() {
        super.checkCapacity();
        System.out.println("Checking extra compartments in the wallet case...");
    }

    public void carry() {
        super.carry();
        System.out.println("Carrying the wallet case in a bag...");
    }
}
