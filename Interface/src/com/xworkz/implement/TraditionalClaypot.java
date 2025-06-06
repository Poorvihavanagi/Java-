package com.xworkz.implement;

import com.xworkz.internal.Claypot;

public class TraditionalClaypot implements Claypot {
    public void heatUp() {
        System.out.println("Heating up the traditional claypot.");
    }

    public void cook() {
        System.out.println("Cooking food in the traditional claypot.");
    }

    public void coolDown() {
        System.out.println("Cooling down the traditional claypot.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the traditional claypot after cooking.");
    }

    @Override
    public void store() {
        System.out.println("Storing the traditional claypot in a dry place.");
    }
}
