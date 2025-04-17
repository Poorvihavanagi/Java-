package com.xworkz.implement;

import com.xworkz.internal.Fruit;

public class Apple implements Fruit {
    public void peel() {
        System.out.println("Peeling the apple.");
    }

    public void eat() {
        System.out.println("Eating the juicy apple.");
    }

    public void store() {
        System.out.println("Storing the apple in a cool place.");
    }
    @Override
    public void dispose() {
        System.out.println("Disposing of the apple core.");
    }
}
