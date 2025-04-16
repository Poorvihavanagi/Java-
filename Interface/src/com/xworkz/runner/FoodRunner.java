package com.xworkz.runner;

import com.xworkz.implement.Pizza;
import com.xworkz.internal.Food;

public class FoodRunner {
    public static void main(String[] args) {

        Food food=new Pizza();
        food.prepare();
        food.serve();
        food.consume();
    }
}
