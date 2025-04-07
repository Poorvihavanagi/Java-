package com.xworkz.inheritance;

public class Gelato extends Icecream{
    public void scoop(){
        System.out.println("Scooping rich chocolate ice cream.");
    }
    public void addFruitPulp(Icecream icecream){
        icecream.eat();
        icecream.addToppings();
        icecream.freeze();
        icecream.prepare();
        icecream.serve();

        if(icecream instanceof Gelato){
            System.out.println("Icecream is instance of gelato");
            Gelato gelato=(Gelato) icecream;
            gelato.scoop();
        }
    }
}
