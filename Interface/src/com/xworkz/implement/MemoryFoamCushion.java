package com.xworkz.implement;

import com.xworkz.internal.Cushion;

public class MemoryFoamCushion implements Cushion {
    public void place() {
        System.out.println("Placing the memory foam cushion on the chair.");
    }

    public void fluff() {
        System.out.println("Fluffing the memory foam cushion to maintain its shape.");
    }

    public void clean() {
        System.out.println("Cleaning the memory foam cushion.");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing the memory foam cushion.");
    }

    @Override
    public void store() {
        System.out.println("Storing the memory foam cushion in a safe spot.");
    }
}
