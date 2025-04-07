package com.xworkz.inheritance;

public class Knife extends Weapon {

    @Override
    public void attack() {
        super.attack();
        System.out.println("Running attack in knife...");
    }

    @Override
    public void defend() {
        super.defend();
        System.out.println("Running defend in knife...");
    }

    @Override
    public void sharpen() {
        super.sharpen();
        System.out.println("Running sharpen in knife...");
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("Running cut in knife...");
    }

    @Override
    public void carry() {
        super.carry();
        System.out.println("Running carry in knife...");
    }

    public void stab() {
        System.out.println("Running stab in knife");
    }
}
