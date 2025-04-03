package com.xworkz.inheritance;

public class Pizza extends Food{
    public void prepare() {
        super.prepare();
        System.out.println("Running prepare food in pizza");
    }
    public void serve() {
        super.serve();
        System.out.println("Running serve food  in pizza");
    }
    public void eat() {
        super.eat();
        System.out.println("Running eat in pizza");
    }
    public void addIngredients() {
        super.addIngredients();
        System.out.println("Running add food ingredients in pizza");
    }
    public void store() {
        super.store();
        System.out.println("Running food store in pizza");
    }
}
