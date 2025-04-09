package com.xworkz.toString.runner;
import com.xworkz.toString.internal.LaundryBasket;

public class LaundryBasketRunner {
    public static void main(String[] args) {
        LaundryBasket basket = new LaundryBasket("Plastic", "Blue", 30);
        System.out.println(basket);
    }
}