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
}
