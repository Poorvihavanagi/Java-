package com.xworkz.isaRelation;

import com.xworkz.inheritance.Breeze;
import com.xworkz.inheritance.Wind;

public class WindRunner
{
    public static void main(String[] args) {
        Breeze breeze = new Breeze();
        breeze.blow();
        breeze.changeDirection();
        breeze.increaseSpeed();
        breeze.decreaseSpeed();
        breeze.carryParticles();

        System.out.println("----------------------------------------------");

        Wind wind = new Breeze();
        wind.blow();
        wind.changeDirection();
        wind.increaseSpeed();
        wind.decreaseSpeed();
        wind.carryParticles();
    }
}
