package com.xworkz.runner;

import com.xworkz.implement.Dog;
import com.xworkz.internal.Animal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
        animal.eat();
        animal.sleep();
    }
}
