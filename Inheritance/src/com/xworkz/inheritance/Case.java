package com.xworkz.inheritance;

public class Case extends Wallet {

    @Override
    public void open() {
        super.open();
        System.out.println("Running open in Case");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("Running close in Case");
    }

    @Override
    public void storeMoney() {
        super.storeMoney();
        System.out.println("Running storeMoney in Case");
    }

    @Override
    public void checkCapacity() {
        super.checkCapacity();
        System.out.println("Running checkCapacity in Case");
    }

    @Override
    public void carry() {
        super.carry();
        System.out.println("Running carry in Case");
    }
}
