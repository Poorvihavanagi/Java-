package com.xworkz.inheritance;

public class Spinach extends Vegetable{
    public void makeJuice(){
        System.out.println("Making fresh carrot juice");
    }

    public void makeSoup(Vegetable vegetable){
        vegetable.chop();
        vegetable.cook();
        vegetable.grow();
        vegetable.wash();
        vegetable.harvest();

        if(vegetable instanceof Spinach){
            System.out.println("Vegetable is instance of spinach");
            Spinach spinach=(Spinach) vegetable;
            spinach.makeJuice();
        }
    }
}
