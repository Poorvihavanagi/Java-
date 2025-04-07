package com.xworkz.isaRelation;

import com.xworkz.inheritance.Knife;
import com.xworkz.inheritance.Sword;
import com.xworkz.inheritance.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {

        System.out.println("----- Running Knife Methods -----");
        Knife knife = new Knife();
        knife.attack();
        knife.defend();
        knife.sharpen();
        knife.cut();
        knife.carry();
        knife.stab();

        System.out.println("----- Running Weapon Methods through Polymorphism -----");
        Weapon weapon = new Knife();
        weapon.attack();
        weapon.defend();
        weapon.sharpen();
        weapon.cut();
        weapon.carry();

        System.out.println("----- Running Sword Methods -----");
        Sword sword = new Sword();
        sword.stab();
        sword.slash(sword);
    }
}
