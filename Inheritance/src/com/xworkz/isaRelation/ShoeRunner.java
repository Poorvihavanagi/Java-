package com.xworkz.isaRelation;

import com.xworkz.inheritance.Shoe;
import com.xworkz.inheritance.Sneaker;

public class ShoeRunner {
    public static void main(String[] args) {
        Sneaker sneaker = new Sneaker();
        sneaker.wear();
        sneaker.walk();
        sneaker.remove();
        sneaker.polish();
        sneaker.checkSize();

        System.out.println("----------------------------------------------------------------------");
        Shoe shoe = new Sneaker();
        shoe.wear();
        shoe.walk();
        shoe.remove();
        shoe.polish();
        shoe.checkSize();
    }
}
