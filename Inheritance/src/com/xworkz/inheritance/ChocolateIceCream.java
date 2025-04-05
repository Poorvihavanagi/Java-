package com.xworkz.inheritance;

public class ChocolateIceCream extends Icecream {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Running prepare in Chocolate IceCream");
    }

    @Override
    public void freeze() {
        super.freeze();
        System.out.println("Running freeze in Chocolate IceCream");
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Running serve in Chocolate IceCream");
    }

    @Override
    public void addToppings() {
        super.addToppings();
        System.out.println("Running add Toppings in Chocolate IceCream");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Running eat in Chocolate IceCream");
    }
}
