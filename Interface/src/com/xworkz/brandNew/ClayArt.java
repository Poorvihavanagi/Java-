package com.xworkz.brandNew;

import com.xworkz.internal.Claypot;
import com.xworkz.internal.Art;

public class ClayArt implements Claypot, Art {

    @Override
    public void heatUp() {
        System.out.println("Heating the claypot.");
    }

    @Override
    public void cook() {
        System.out.println("Cooking in the claypot.");
    }

    @Override
    public void coolDown() {
        System.out.println("Allowing the claypot to cool down.");
    }

    @Override
    public void create() {
        System.out.println("Creating a piece of art.");
    }

    @Override
    public void describeStyle() {
        System.out.println("Describing the style of the art.");
    }

    @Override
    public void display() {
        System.out.println("Displaying the art piece.");
    }
}
