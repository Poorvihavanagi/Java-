package com.xworkz.implement;

import com.xworkz.internal.BagOfChips;

public class PotatoChips implements BagOfChips {
    public void openBag() {
        System.out.println("Opening the bag of potato chips.");
    }

    public void eatChips() {
        System.out.println("Eating the crispy potato chips.");
    }

    public void closeBag() {
        System.out.println("Closing the bag of potato chips to keep them fresh.");
    }
    @Override
    public void shakeBag() {
        System.out.println("Shaking the potato chips bag for better crunch.");
    }

    @Override
    public void resealBag() {
        System.out.println("Resealing the potato chips bag to keep them crunchy.");
    }
}
