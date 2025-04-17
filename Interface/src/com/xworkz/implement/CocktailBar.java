package com.xworkz.implement;

import com.xworkz.internal.Bar;

public class CocktailBar implements Bar {
    public void serveDrink() {
        System.out.println("Serving a refreshing cocktail at the bar.");
    }

    public void playMusic() {
        System.out.println("Playing upbeat music in the bar.");
    }

    public void closeBar() {
        System.out.println("Closing the bar for the night.");
    }

    @Override
    public void provideSnacks() {
        System.out.println("Serving gourmet snacks with cocktails.");
    }

    @Override
    public void offerDiscounts() {
        System.out.println("Offering a 10% discount on signature cocktails during happy hour.");
    }
}
