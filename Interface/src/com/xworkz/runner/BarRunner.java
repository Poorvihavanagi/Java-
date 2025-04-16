package com.xworkz.runner;

import com.xworkz.internal.Bar;
import com.xworkz.implement.CocktailBar;

public class BarRunner {
    public static void main(String[] args) {
        Bar bar = new CocktailBar();
        bar.serveDrink();
        bar.playMusic();
        bar.closeBar();
    }
}
