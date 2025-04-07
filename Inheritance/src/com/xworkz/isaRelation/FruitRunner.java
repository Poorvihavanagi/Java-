package com.xworkz.isaRelation;

import com.xworkz.inheritance.Fruit;
import com.xworkz.inheritance.Apple;
import com.xworkz.inheritance.Mango;

public class FruitRunner {

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.grow();
        apple.ripen();
        apple.harvest();
        apple.wash();
        apple.eat();
        System.out.println("----------------------------------------------------");
        Fruit fruit = new Apple();
        fruit.grow();
        fruit.ripen();
        fruit.harvest();
        fruit.wash();
        fruit.eat();
        System.out.println("----------------------------------------------------");
        Mango mango=new Mango();
        mango.makeShake(mango);
    }
}
