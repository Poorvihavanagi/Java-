package com.xworkz.inheritance;

public class Sneaker extends Shoe {

    @Override
    public void wear() {
        super.wear();
        System.out.println("Running wear in sneaker");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Running walk in sneaker");
    }

    @Override
    public void remove() {
        super.remove();
        System.out.println("Running remove in sneaker");
    }

    @Override
    public void polish() {
        super.polish();
        System.out.println("Running polish in sneaker");
    }

    @Override
    public void checkSize() {
        super.checkSize();
        System.out.println("Running check size in sneaker");
    }
}
