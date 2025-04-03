package com.xworkz.isaRelation;

import com.xworkz.inheritance.Toothpaste;
import com.xworkz.inheritance.Product;

public class ToothPasteRunner {
    public static void main(String[] args) {

        Toothpaste toothpaste = new Toothpaste();
        toothpaste.use();
        toothpaste.checkExpiry();
        toothpaste.apply();
        toothpaste.store();
        toothpaste.dispose();
        System.out.println("--------------------------------------------------------------------");

        Product product = new Toothpaste();
        product.use();
        product.checkExpiry();
        product.apply();
        product.store();
        product.dispose();
    }
}
