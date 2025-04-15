package com.xworkz.Hybrid;

class Frog extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Frog is swimming.");
    }
}
