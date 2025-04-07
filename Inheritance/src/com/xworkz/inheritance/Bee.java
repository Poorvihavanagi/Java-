package com.xworkz.inheritance;

public class Bee extends Insect{
    public void bite(){
        System.out.println("Bee uses its stinger to defend");
    }
    public void makeHoney(Insect insect){
        insect.description();
        insect.move();
        insect.sound();
        insect.food();
        insect.habitat();

        if(insect instanceof Bee){
            System.out.println("Insect is an instance of Bee");
            Bee bee=(Bee) insect;
            bee.bite();
        }
    }
}
