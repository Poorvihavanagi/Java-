package com.xworkz.copies;

import com.xworkz.brandNew.Drink;
import com.xworkz.internal.Beverage;
import com.xworkz.internal.Mug;

public class DrinkRunner {
    public static void main(String[] args) {
        Beverage beverage = new Drink();
        beverage.brew();
        beverage.pour();

        System.out.println("------------------------------");

        Mug mug = new Drink();
        mug.fill();
        mug.drink();
        mug.clean();
    }
}
