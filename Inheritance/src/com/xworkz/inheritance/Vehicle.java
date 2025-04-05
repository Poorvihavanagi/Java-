package com.xworkz.inheritance;

public class Vehicle extends Train {

    @Override
    public void start() {
        super.start();
        System.out.println("Running train start in vehicle");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Running train stop in vehicle");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("Running train accelerate in vehicle");
    }

    @Override
    public void applyBrakes() {
        super.applyBrakes();
        System.out.println("Running train brakes in vehicle");
    }

    @Override
    public void honk() {
        super.honk();
        System.out.println("Running train honk in vehicle");
    }
}
