package com.xworkz.isaRelation;

import com.xworkz.inheritance.Drink;
import com.xworkz.inheritance.Coffee;

public class DrinkRunner {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepare();
        coffee.pour();
        coffee.serve();
        coffee.sip();
        coffee.finish();
        System.out.println("--------------------------------------------------");
        Drink drink = new Coffee();
        drink.prepare();
        drink.pour();
        drink.serve();
        drink.sip();
        drink.finish();
    }
}
