package com.xworkz.inheritance;

public class Smoothie extends Beverage{


    public void blend() {
        System.out.println("Blending the smoothie");
    }
    public void addIce(Beverage beverage){
        beverage.pour();
        beverage.drink();
        beverage.checkTemperature();
        beverage.shake();
        beverage.serve();

        if (beverage instanceof Smoothie) {
            System.out.println("beverage is an instance of Smoothie");
            Smoothie smoothie = (Smoothie) beverage;
            smoothie.blend();
        }
    }
}
