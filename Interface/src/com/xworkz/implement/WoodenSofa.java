package com.xworkz.implement;

import com.xworkz.internal.Sofa;

public class WoodenSofa implements Sofa {
    public void sit() {
        System.out.println("Sitting on the wooden sofa.");
    }

    public void fold() {
        System.out.println("Folding the wooden sofa.");
    }

    public void move() {
        System.out.println("Moving the wooden sofa.");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the wooden sofa with a wood polish.");
    }
}
