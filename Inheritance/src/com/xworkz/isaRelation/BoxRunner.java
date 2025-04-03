package com.xworkz.isaRelation;

import com.xworkz.inheritance.Box;
import com.xworkz.inheritance.Storage;
public class BoxRunner
{
    public static void main(String[] args) {

        Storage storageBox = new Storage();
        storageBox.open();
        storageBox.close();
        storageBox.storeItems();
        storageBox.checkContents();
        storageBox.move();
        System.out.println("-------------------------------------------------------------------------");
        Box box = new Storage();
        box.open();
        box.close();
        box.storeItems();
        box.checkContents();
        box.move();
    }
}
