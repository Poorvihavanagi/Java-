package com.xworkz.isaRelation;

import com.xworkz.inheritance.ChocolateIceCream;
import com.xworkz.inheritance.Icecream;


public class IceCreamRunner {
    public static void main(String[] args) {
        ChocolateIceCream chocolateIceCream = new ChocolateIceCream();
        chocolateIceCream.prepare();
        chocolateIceCream.freeze();
        chocolateIceCream.serve();
        chocolateIceCream.addToppings();
        chocolateIceCream.eat();

        System.out.println("-------------------------------------------------------");
        Icecream iceCream = new ChocolateIceCream();
        iceCream.prepare();
        iceCream.freeze();
        iceCream.serve();
        iceCream.addToppings();
        iceCream.eat();
    }
}
