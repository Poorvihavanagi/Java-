package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bird;
import com.xworkz.inheritance.Parrot;

public class BirdRunner {
    public static void main(String[] args) {

        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.sing();
        parrot.eat();
        parrot.sleep();
        parrot.buildNest();

        System.out.println("-----------------------------------------------");
        Bird bird = new Parrot();
        bird.fly();
        bird.sing();
        bird.eat();
        bird.sleep();
        bird.buildNest();
    }
}
