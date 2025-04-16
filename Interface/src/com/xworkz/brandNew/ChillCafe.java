package com.xworkz.brandNew;

import com.xworkz.internal.Bar;
import com.xworkz.internal.Bakery;

public class ChillCafe implements Bar, Bakery {

    @Override
    public void serveDrink() {
        System.out.println("Serving chilled drinks at the bar.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing upbeat music in the bar area.");
    }

    @Override
    public void closeBar() {
        System.out.println("Closing the bar section.");
    }

    @Override
    public void bakeItem() {
        System.out.println("Baking fresh bread and cakes.");
    }

    @Override
    public void displayItems() {
        System.out.println("Displaying bakery items in the showcase.");
    }

    @Override
    public void sellItem() {
        System.out.println("Selling bakery items to customers.");
    }
}
