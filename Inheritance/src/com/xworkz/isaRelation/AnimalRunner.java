package com.xworkz.isaRelation;

import com.xworkz.inheritance.Animal;
import com.xworkz.inheritance.Dog;
import com.xworkz.inheritance.Tiger;

public class AnimalRunner
{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.sleep();
        dog.walk();
        dog.makeSound();
        dog.breathe();

        System.out.println("---------------------------------------------------------------");
        
        Animal animal=new Dog();
        animal.eat();
        animal.sleep();
        animal.walk();
        animal.makeSound();
        animal.breathe();

        System.out.println("-----------------------------------------------------------------");

        Tiger tiger=new Tiger();
        tiger.hunt(tiger);
    }
}
