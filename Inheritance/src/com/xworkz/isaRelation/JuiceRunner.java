package com.xworkz.isaRelation;

import com.xworkz.inheritance.Beverage;
import com.xworkz.inheritance.Juice;

public class JuiceRunner {
    public static void main(String[] args) {

        Beverage beverage = new Beverage();
        beverage.drink();
        beverage.pour();
        beverage.checkTemperature();
        beverage.shake();
        beverage.serve();

        System.out.println("------------------------------------------------");
        Juice juice = new Juice();
        juice.drink();
        juice.pour();
        juice.checkTemperature();
        juice.shake();
        juice.serve();
    }
}
