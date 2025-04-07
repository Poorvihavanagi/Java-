package com.xworkz.isaRelation;

import com.xworkz.inheritance.Food;
import com.xworkz.inheritance.Pizza;
import com.xworkz.inheritance.Sandwich;

public class FoodRunner
{
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.addIngredients();
        pizza.serve();
        pizza.eat();
        pizza.store();

        System.out.println("----------------------------------------");
        Food food = new Pizza();
        food.prepare();
        food.addIngredients();
        food.serve();
        food.eat();
        food.store();

        System.out.println("----------------------------------------");
        Sandwich sandwich=new Sandwich();
        sandwich.toast(sandwich);
    }
}
