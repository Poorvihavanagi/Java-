package com.xworkz.isaRelation;

import com.xworkz.inheritance.Elephant;
import com.xworkz.inheritance.Mammal;

public class MammalRunner
{
    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.walk();
        elephant.breathe();
        elephant.giveBirth();
        System.out.println("------------------------------------------------------------------------------------");
        Mammal mammal = new Elephant();
        mammal.eat();
        mammal.sleep();
        mammal.walk();
        mammal.breathe();
        mammal.giveBirth();
    }
}
