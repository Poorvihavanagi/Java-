package com.xworkz.inheritance;

public class Tiger extends Animal{

    public void run(){
        System.out.println("Tiger is running");
    }

    public void hunt(Animal animal){
        animal.eat();
        animal.sleep();
        animal.walk();
        animal.makeSound();
        animal.breathe();
        if(animal instanceof Tiger){
            System.out.println("Animal is an instance of Tiger");
            Tiger tiger=(Tiger) animal;
            tiger.run();
        }

    }
}
