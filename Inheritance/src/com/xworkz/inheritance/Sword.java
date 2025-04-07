package com.xworkz.inheritance;

public class Sword extends Weapon{
    public void stab() {
        System.out.println("Knife is used to stab the target...");
    }
    public void slash(Weapon weapon){
        if(weapon instanceof Sword){
            System.out.println("Weapon is instance of sword");
            Sword sword=(Sword) weapon;
            sword.stab();
        }
    }
}
