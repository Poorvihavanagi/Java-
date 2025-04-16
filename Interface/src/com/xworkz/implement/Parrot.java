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
}
