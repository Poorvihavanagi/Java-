package com.xworkz.runner;

import com.xworkz.internal.Fruit;
import com.xworkz.implement.Apple;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit = new Apple();
        fruit.peel();
        fruit.eat();
        fruit.store();
        fruit.dispose();
    }
}
