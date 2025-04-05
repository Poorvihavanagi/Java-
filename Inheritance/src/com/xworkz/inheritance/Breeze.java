package com.xworkz.inheritance;

public class Breeze extends Wind {

    @Override
    public void blow() {
        super.blow();
        System.out.println("Running blow in Breeze");
    }

    @Override
    public void changeDirection() {
        super.changeDirection();
        System.out.println("Running change Direction in Breeze");
    }

    @Override
    public void increaseSpeed() {
        super.increaseSpeed();
        System.out.println("Running increase Speed in Breeze");
    }

    @Override
    public void decreaseSpeed() {
        super.decreaseSpeed();
        System.out.println("Running decrease Speed in Breeze");
    }

    @Override
    public void carryParticles() {
        super.carryParticles();
        System.out.println("Running carry Particles in Breeze");
    }
}
