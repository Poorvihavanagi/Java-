package com.xworkz.inheritance;

public class HandBag extends Bag{

    public void checkZip(Bag bag){
        bag.carry();
        bag.open();
        bag.close();
        bag.checkCapacity();
        bag.organizeItems();

        if(bag instanceof HandBag){
            System.out.println("bag is an instance of BagPack");
            BagPack bagPack=(BagPack) bag;
            bagPack.buckleStrap();
        }

    }
}
