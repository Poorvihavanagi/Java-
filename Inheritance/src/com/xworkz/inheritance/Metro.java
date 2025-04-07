package com.xworkz.inheritance;

public class Metro extends Transportation {

    @Override
    public void move() {
        super.move();
        System.out.println("Running move in metro...");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Running stop in metro...");
    }

    @Override
    public void fuel() {
        super.fuel();
        System.out.println("Running fuel in metro...");
    }

    @Override
    public void capacity() {
        super.capacity();
        System.out.println("Running capacity in metro...");
    }

    @Override
    public void speed() {
        super.speed();
        System.out.println("Running speed in metro...");
    }

    public void openDoors(){
        System.out.println("Running open doors in metro");
    }
}
