package com.xworkz.isaRelation;

import com.xworkz.inheritance.Jewel;
import com.xworkz.inheritance.Necklace;

public class JewelRunner {
    public static void main(String[] args) {

        Necklace necklace = new Necklace();
        necklace.shine();
        necklace.wear();
        necklace.polish();
        necklace.checkPurity();
        necklace.storeSafely();

        System.out.println("-----------------------------------------------------------");

        Jewel jewel = new Necklace();
        jewel.shine();
        jewel.wear();
        jewel.polish();
        jewel.checkPurity();
        jewel.storeSafely();
    }
}
