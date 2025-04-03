package com.xworkz.inheritance;

public class Juice extends Beverage {

    public void drink() {
        super.drink();
        System.out.println("Drinking fresh juice...");
    }
    public void pour() {
        super.pour();
        System.out.println("Pouring fresh juice into a glass...");
    }
    public void checkTemperature() {
        super.checkTemperature();
        System.out.println("Checking if the juice is cold...");
    }
    public void shake() {
        super.shake();
        System.out.println("Shaking the juice bottle...");
    }
    public void serve() {
        super.serve();
        System.out.println("Serving fresh juice with ice cubes...");
    }
}
