package com.xworkz.copies;

import com.xworkz.internal.Fruit;
import com.xworkz.internal.Food;
import com.xworkz.brandNew.Meal;

public class MealRunner {
    public static void main(String[] args) {
        Fruit fruit = new Meal();
        fruit.peel();
        fruit.eat();
        fruit.store();

        System.out.println("------------------------------");

        Food food = new Meal();
        food.prepare();
        food.serve();
        food.consume();
    }
}
