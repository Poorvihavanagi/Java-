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
}
