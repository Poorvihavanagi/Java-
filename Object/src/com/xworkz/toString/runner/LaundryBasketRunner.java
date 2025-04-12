package com.xworkz.toString.runner;
import com.xworkz.toString.internal.LaundryBasket;

public class LaundryBasketRunner {
    public static void main(String[] args) {
        LaundryBasket basket = new LaundryBasket("Plastic", "Blue", 30);
        System.out.println(basket);

        int hash = basket.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(basket));

        LaundryBasket basket1 = new LaundryBasket("Plastic", "Blue", 30);
        LaundryBasket basket2 = new LaundryBasket("Wooden", "Red", 50);

        System.out.println("Checking same location: " + (basket1 == basket2));
        boolean same = basket1.equals(basket2);
        System.out.println("Basket1 is same as Basket2: " + same);
    }
}