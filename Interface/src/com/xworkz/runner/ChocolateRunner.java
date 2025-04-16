package com.xworkz.runner;

import com.xworkz.internal.Chocolate;
import com.xworkz.implement.MilkChocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate = new MilkChocolate();
        chocolate.unwrap();
        chocolate.eat();
        chocolate.store();
    }
}
