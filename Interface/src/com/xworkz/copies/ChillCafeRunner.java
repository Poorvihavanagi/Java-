package com.xworkz.copies;

import com.xworkz.internal.Bar;
import com.xworkz.internal.Bakery;
import com.xworkz.brandNew.ChillCafe;

public class ChillCafeRunner {
    public static void main(String[] args) {
        Bar bar = new ChillCafe();
        bar.serveDrink();
        bar.playMusic();
        bar.closeBar();

        System.out.println("------------------------------");

        Bakery bakery = new ChillCafe();
        bakery.bakeItem();
        bakery.displayItems();
        bakery.sellItem();
    }
}
