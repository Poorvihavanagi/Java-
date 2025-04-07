package com.xworkz.inheritance;

public class Mango extends Fruit{
    public void slice(){
        System.out.println("Slicing the apple into pieces");
    }
    public void makeShake(Fruit fruit){
        fruit.eat();
        fruit.grow();
        fruit.harvest();
        fruit.wash();
        fruit.ripen();
        if(fruit instanceof Mango){
            System.out.println("Fruit is a instance of mango");
            Mango mango=(Mango) fruit;
            mango.slice();
        }
    }
}
