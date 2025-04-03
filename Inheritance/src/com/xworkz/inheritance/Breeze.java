package com.xworkz.inheritance;

public class Breeze extends Wind {

    public void blow() {
        super.blow();
        System.out.println("Running blow wind in breeze");
    }
    public void changeDirection() {
        super.changeDirection();
        System.out.println("Running change wind direction in breeze");
    }
    public void increaseSpeed() {
        super.increaseSpeed();
        System.out.println("Running increase wind in breeze");
    }
    public void decreaseSpeed() {
        super.decreaseSpeed();
        System.out.println("Running decrease wind in breeze");
    }
    public void carryParticles() {
        super.carryParticles();
        System.out.println("Running carry wind particles in breeze");
    }
}
