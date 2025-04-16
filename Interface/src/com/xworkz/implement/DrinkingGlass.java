package com.xworkz.implement;

import com.xworkz.internal.Glass;

public class DrinkingGlass implements Glass {
    public void fill() {
        System.out.println("Filling the drinking glass with water.");
    }

    public void drink() {
        System.out.println("Drinking the water from the glass.");
    }

    public void clean() {
        System.out.println("Cleaning the drinking glass after use.");
    }
}
