package com.xworkz.inheritance;

public class Sandwich extends Food{
    public void addToppings(){
        System.out.println("add toppings on pizza");
    }
    public void toast(Food food){
        food.eat();
        food.addIngredients();
        food.prepare();
        food.serve();
        food.store();

        if(food instanceof Sandwich){
            System.out.println("Food is instance of sandwich");
            Sandwich sandwich=(Sandwich) food;
            sandwich.addToppings();
        }
    }
}
