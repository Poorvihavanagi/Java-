package com.xworkz.implement;

import com.xworkz.internal.Stationery;

public class Sharpner implements Stationery {
    public void use() {
        System.out.println("Using the pen to write.");
    }

    public void keepInPouch() {
        System.out.println("Keeping the pen in the pouch.");
    }

    public void share() {
        System.out.println("Sharing the pen with a friend.");
    }
}
