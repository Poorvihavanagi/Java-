package com.xworkz.implement;

import com.xworkz.internal.Backpack;

public class WildcraftBag implements Backpack {
    public void openZip() {
        System.out.println("Opening backpack zip.");
    }
    public void storeItems() {
        System.out.println("Storing items in backpack.");
    }
    public void carry() {
        System.out.println("Carrying backpack.");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning the Wildcraft backpack.");
    }

    @Override
    public void adjustStraps() {
        System.out.println("Adjusting the straps of the Wildcraft backpack.");
    }
}
