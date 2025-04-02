package com.xworkz.inheritance;

public class Vehicle extends Train
{
    public void start() {
        super.start();
        System.out.println("Running train start in vehicle");
    }
    public void stop() {
        super.stop();
        System.out.println("Running train stop in vehicle");
    }
    public void accelerate() {
        super.accelerate();
        System.out.println("Running train accelerate in vehicle");
    }
    public void applyBrakes() {
        super.applyBrakes();
        System.out.println("Running train brakes in vehicle");
    }
    public void honk() {
        super.honk();
        System.out.println("Running train honk in vehicle");
    }
}
