package com.xworkz.toString.runner;
import com.xworkz.toString.internal.ShoppingBag;

public class ShoppingBagRunner {
    public static void main(String[] args) {
        ShoppingBag bag = new ShoppingBag("Cotton", "White", 10);
        System.out.println(bag);

        int hash = bag.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(bag));
    }
}
