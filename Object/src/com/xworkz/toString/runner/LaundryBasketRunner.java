package com.xworkz.toString.runner;
import com.xworkz.toString.internal.LaundryBasket;

public class LaundryBasketRunner {
    public static void main(String[] args) {
        LaundryBasket basket = new LaundryBasket("Plastic", "Blue", 30);
        System.out.println(basket);

        int hash = basket.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(basket));
    }
}