package com.xworkz.inheritance;

public class Knife extends Weapon {

    public void attack() {
        super.attack();
        System.out.println("Knife is used for close-range attacks...");
    }
    public void defend() {
        super.defend();
        System.out.println("Knife can be used to block or parry attacks...");
    }

    public void sharpen() {
        super.sharpen();
        System.out.println("Sharpening the knife blade for precision...");
    }
    public void cut() {
        super.cut();
        System.out.println("Knife is used for cutting objects...");
    }
    public void carry() {
        super.carry();
        System.out.println("Knife is lightweight and easy to carry...");
    }
}
