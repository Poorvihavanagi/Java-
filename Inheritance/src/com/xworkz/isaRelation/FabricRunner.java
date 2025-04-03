package com.xworkz.isaRelation;

import com.xworkz.inheritance.Fabric;
import com.xworkz.inheritance.Silk;

public class FabricRunner {
    public static void main(String[] args) {
        Silk silk = new Silk();
        silk.weave();
        silk.dye();
        silk.wash();
        silk.dry();
        silk.checkQuality();
        System.out.println("------------------------------------------------------------");
        Fabric fabric = new Silk();
        fabric.weave();
        fabric.dye();
        fabric.wash();
        fabric.dry();
        fabric.checkQuality();
    }
}
