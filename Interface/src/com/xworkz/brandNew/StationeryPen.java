package com.xworkz.brandNew;

import com.xworkz.internal.Stationery;
import com.xworkz.internal.Pen;

public class StationeryPen implements Stationery, Pen {

    @Override
    public void use() {
        System.out.println("Using the stationery item.");
    }

    @Override
    public void keepInPouch() {
        System.out.println("Keeping the stationery in the pouch.");
    }

    @Override
    public void share() {
        System.out.println("Sharing the stationery with others.");
    }

    @Override
    public void write() {
        System.out.println("Writing with the pen.");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the pen.");
    }

    @Override
    public void click() {
        System.out.println("Clicking the pen.");
    }
}
