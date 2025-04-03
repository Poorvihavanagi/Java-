package com.xworkz.isaRelation;

import com.xworkz.inheritance.Eraser;
import com.xworkz.inheritance.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Eraser eraser = new Eraser();
        eraser.use();
        eraser.store();
        eraser.checkQuality();
        eraser.replace();
        eraser.dispose();

        System.out.println("------------------------------------------------------------------");
        Stationery stationery = new Eraser();
        stationery.use();
        stationery.store();
        stationery.checkQuality();
        stationery.replace();
        stationery.dispose();
    }
}
