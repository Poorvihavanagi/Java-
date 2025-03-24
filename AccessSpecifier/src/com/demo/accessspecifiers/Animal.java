package com.demo.accessspecifiers;

public class Animal
{
    Zoo zoo = new Zoo();

    public void display(){
        zoo.name="Wild Safari";
        zoo.location="California";

        System.out.println("Animal is in the " + zoo.name);

        zoo.openZoo();
        zoo.addAnimal();
    }
}
