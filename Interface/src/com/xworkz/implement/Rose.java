package com.xworkz.implement;

import com.xworkz.internal.Flower;

public class Rose implements Flower {
    public void bloom() {
        System.out.println("Rose is blooming.");
    }

    public void smell() {
        System.out.println("Smelling the fragrant rose.");
    }

    public void attractBees() {
        System.out.println("Rose is attracting bees.");
    }
    @Override
    public void displayColor() {
        System.out.println("The rose is red.");
    }
}
