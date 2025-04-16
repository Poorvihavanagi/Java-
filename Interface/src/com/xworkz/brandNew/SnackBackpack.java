package com.xworkz.implement;

import com.xworkz.internal.BagOfChips;
import com.xworkz.internal.Backpack;

public class SnackBackpack implements BagOfChips, Backpack {

    @Override
    public void openBag() {
        System.out.println("Opening the bag of chips.");
    }

    @Override
    public void eatChips() {
        System.out.println("Eating crunchy chips.");
    }

    @Override
    public void closeBag() {
        System.out.println("Closing the bag of chips.");
    }

    @Override
    public void openZip() {
        System.out.println("Opening the backpack zip.");
    }

    @Override
    public void storeItems() {
        System.out.println("Storing chips and a water bottle in the backpack.");
    }

    @Override
    public void carry() {
        System.out.println("Carrying the backpack to a picnic.");
    }
}
