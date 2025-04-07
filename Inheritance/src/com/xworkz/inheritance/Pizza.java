package com.xworkz.inheritance;

public class Pizza extends Food {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Running prepare food in pizza");
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Running serve food in pizza");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in pizza");
    }

    @Override
    public void addIngredients() {
        super.addIngredients();
        System.out.println("Running add food ingredients in pizza");
    }

    @Override
    public void store() {
        super.store();
        System.out.println("Running food store in pizza");
    }

    public void addToppings() {
        System.out.println("Running add toppings in pizza");
    }
}
