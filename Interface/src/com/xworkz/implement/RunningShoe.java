package com.xworkz.implement;

import com.xworkz.internal.Shoe;

public class RunningShoe implements Shoe {
    public void wear() {
        System.out.println("Wearing running shoes.");
    }
    public void tieLaces() {
        System.out.println("Tying shoe laces.");
    }
    public void remove() {
        System.out.println("Removing the shoes.");
    }
}
