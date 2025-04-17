package com.xworkz.runner;

import com.xworkz.internal.Bird;
import com.xworkz.implement.Parrot;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Parrot();
        bird.fly();
        bird.sing();
        bird.eat();


        bird.chirp();
        bird.buildNest();


    }
}
