package com.xworkz.isaRelation;

import com.xworkz.inheritance.Gloves;
import com.xworkz.inheritance.ProtectiveGear;

public class GlovesRunner {
    public static void main(String[] args) {
        Gloves gloves = new Gloves();
        gloves.wear();
        gloves.remove();
        gloves.checkMaterial();
        gloves.wash();
        gloves.store();

        System.out.println("-------------------------------------");
        ProtectiveGear gear = new Gloves();
        gear.wear();
        gear.remove();
        gear.checkMaterial();
        gear.wash();
        gear.store();
    }
}
