package com.xworkz.runner;

import com.xworkz.internal.Beverage;
import com.xworkz.implement.Coffee;

public class BeverageRunner {
    public static void main(String[] args) {
        Beverage beverage = new Coffee();
        beverage.brew();
        beverage.pour();
        beverage.drink();

        beverage.addSugar();
        beverage.addMilk();
    }
}
