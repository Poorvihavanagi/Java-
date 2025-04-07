package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bag;
import com.xworkz.inheritance.BagPack;
import com.xworkz.inheritance.HandBag;

public class BagRunner {
    public static void main(String[] args) {
        BagPack backpack = new BagPack();
        backpack.open();
        backpack.close();
        backpack.carry();
        backpack.checkCapacity();
        backpack.organizeItems();

        System.out.println("-------------------------------------------------");

        Bag bag = new BagPack();
        bag.open();
        bag.close();
        bag.carry();
        bag.checkCapacity();
        bag.organizeItems();

        System.out.println("-------------------------------------------");

        HandBag handBag=new HandBag();
        handBag.checkZip(backpack);
        handBag.checkZip(bag);

    }
}
