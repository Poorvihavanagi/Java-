package com.xworkz.toString.runner;
import com.xworkz.toString.internal.ShoppingBag;

public class ShoppingBagRunner {
    public static void main(String[] args) {
        ShoppingBag bag = new ShoppingBag("Cotton", "White", 10);
        System.out.println(bag);

        int hash = bag.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bag));

        ShoppingBag shoppingBag1 = new ShoppingBag("Cotton", "White", 10);
        ShoppingBag shoppingBag2 = new ShoppingBag("Cotton", "White", 10);

        System.out.println("Checking same location: " + (shoppingBag1 == shoppingBag2));
        boolean same = shoppingBag1.equals(shoppingBag2);
        System.out.println("ShoppingBag1 is same as ShoppingBag2: " + same);
    }
}
