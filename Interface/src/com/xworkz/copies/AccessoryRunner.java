package com.xworkz.copies;

import com.xworkz.brandNew.Accessory;
import com.xworkz.internal.Comb;
import com.xworkz.internal.Tissue;

public class AccessoryRunner {
    public static void main(String[] args) {

        Comb comb = new Accessory();
        comb.untangleHair();
        comb.cleanComb();
        comb.keepInDrawer();

        System.out.println("------------------------------");

        Tissue tissue = new Accessory();
        tissue.use();
        tissue.dispose();
        tissue.store();
    }
}
