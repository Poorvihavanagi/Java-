package com.xworkz.inheritance;

public class Juice extends Beverage {

    @Override
    public void drink() {
        super.drink();
        System.out.println("Running drink in juice");
    }

    @Override
    public void pour() {
        super.pour();
        System.out.println("Running pour in juice");
    }

    @Override
    public void checkTemperature() {
        super.checkTemperature();
        System.out.println("Running checkTemperature in juice");
    }

    @Override
    public void shake() {
        super.shake();
        System.out.println("Running shake in juice");
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Running serve in juice");
    }
}
