package com.xworkz.toString.runner;

import com.xworkz.toString.internal.Animal;
import com.xworkz.toString.internal.Bag;

public class BagRunner
{
    public static void main(String[] args) {
        Bag bag = new Bag("American Tourister", "Backpack", 2499.00);
        System.out.println(bag);

        int hash = bag.hashCode();
        System.out.println("Code: " +hash);
        System.out.println(new Bag("Wildcraft", "Duffel", 1999.00).hashCode());


        Bag bag1 = new Bag("American Tourister", "Backpack", 1999.9);
        Bag bag2 = new Bag("Skybag", "Duffel", 1599.5);

        System.out.println("Checking same location: " + (bag1 == bag2));
        boolean same = bag2.equals(bag1);
        System.out.println("Bag1 is same as Bag2: " + same);
    }
}
