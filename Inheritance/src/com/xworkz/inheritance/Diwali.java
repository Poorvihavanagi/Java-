package com.xworkz.inheritance;

public class Diwali extends Festival {

    @Override
    public void celebrate() {
        super.celebrate();
        System.out.println("Running celebrate in Diwali");
    }

    @Override
    public void lightDecorations() {
        super.lightDecorations();
        System.out.println("Running light Decorations in Diwali");
    }

    @Override
    public void distributeSweets() {
        super.distributeSweets();
        System.out.println("Running distribute Sweets in Diwali");
    }

    @Override
    public void performRituals() {
        super.performRituals();
        System.out.println("Running perform Rituals in Diwali");
    }

    @Override
    public void enjoyFireworks() {
        super.enjoyFireworks();
        System.out.println("Running enjoy Fireworks in Diwali");
    }
    public void lightLamps() {
        System.out.println("Running light lamps in diwali");
    }
}
