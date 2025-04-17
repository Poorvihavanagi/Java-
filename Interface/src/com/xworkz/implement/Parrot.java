package com.xworkz.implement;

import com.xworkz.internal.Bird;

public class Parrot implements Bird {
    public void fly() {
        System.out.println("Parrot is flying across the sky.");
    }

    public void sing() {
        System.out.println("Parrot is mimicking human speech melodiously.");
    }

    public void eat() {
        System.out.println("Parrot is eating fruits and seeds.");
    }
    @Override
    public void chirp() {
        System.out.println("Parrot is chirping happily.");
    }

    @Override
    public void buildNest() {
        System.out.println("Parrot is building a nest with twigs and leaves.");
    }
}
