package com.xworkz.inheritance;

public class Apple extends Fruit {

    @Override
    public void grow() {
        super.grow();
        System.out.println("Running grow in Apple");
    }

    @Override
    public void ripen() {
        super.ripen();
        System.out.println("Running ripen in Apple");
    }

    @Override
    public void harvest() {
        super.harvest();
        System.out.println("Running harvest in Apple");
    }

    @Override
    public void wash() {
        super.wash();
        System.out.println("Running wash in Apple");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in Apple");
    }
}
