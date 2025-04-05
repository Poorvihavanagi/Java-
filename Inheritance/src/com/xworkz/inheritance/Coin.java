package com.xworkz.inheritance;

public class Coin extends Currency {

    @Override
    public void printValue() {
        super.printValue();
        System.out.println("Running printValue in Coin");
    }

    @Override
    public void checkAuthenticity() {
        super.checkAuthenticity();
        System.out.println("Running checkAuthenticity in Coin");
    }

    @Override
    public void exchange() {
        super.exchange();
        System.out.println("Running exchange in Coin");
    }

    @Override
    public void useForPayment() {
        super.useForPayment();
        System.out.println("Running useForPayment in Coin");
    }

    @Override
    public void collect() {
        super.collect();
        System.out.println("Running collect in Coin");
    }
}
