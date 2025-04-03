package com.xworkz.isaRelation;
import com.xworkz.inheritance.Jewelry;
import com.xworkz.inheritance.Ring;

public class JewelryRunner {
    public static void main(String[] args) {
        Ring ring = new Ring();
        ring.wear();
        ring.shine();
        ring.design();
        ring.value();
        ring.store();
        System.out.println("--------------------------------------------------------------------------------");
        Jewelry jewelry = new Ring();
        jewelry.wear();
        jewelry.shine();
        jewelry.design();
        jewelry.value();
        jewelry.store();
    }
}
