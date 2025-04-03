package com.xworkz.inheritance;


public class ChocolateIceCream extends Icecream {
    public void prepare() {
        super.prepare();
        System.out.println("Preparing chocolate-flavored ice cream...");
    }

    public void freeze() {
        super.freeze();
        System.out.println("Freezing chocolate ice cream at optimal temperature...");
    }

    public void serve() {
        super.serve();
        System.out.println("Serving chocolate ice cream with a smile...");
    }

    public void addToppings() {
        super.addToppings();
        System.out.println("Adding chocolate chips and syrup as toppings...");
    }

    public void eat() {
        super.eat();
        System.out.println("Enjoying the delicious chocolate ice cream...");
    }
}
