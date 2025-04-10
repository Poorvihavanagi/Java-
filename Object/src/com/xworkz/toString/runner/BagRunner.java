package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Bag;

public class BagRunner
{
    public static void main(String[] args) {
        Bag bag = new Bag("American Tourister", "Backpack", 2499.00);
        System.out.println(bag);

        int hash = bag.hashCode();
        System.out.println("Code: " +hash);
        System.out.println(new Bag("Wildcraft", "Duffel", 1999.00).hashCode());
    }
}
