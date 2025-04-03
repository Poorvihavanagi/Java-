package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bangle;
import com.xworkz.inheritance.Accessory;
public class AccessoryRunner
{
    public static void main(String[] args) {
        Bangle bangle = new Bangle();
        bangle.wear();
        bangle.remove();
        bangle.checkMaterial();
        bangle.clean();
        bangle.store();

        System.out.println("--------------------------------------");
        Accessory accessory = new Bangle();
        accessory.wear();
        accessory.remove();
        accessory.checkMaterial();
        accessory.clean();
        accessory.store();
    }
}
