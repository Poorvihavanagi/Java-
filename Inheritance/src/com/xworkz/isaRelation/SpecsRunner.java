package com.xworkz.isaRelation;

import com.xworkz.inheritance.ContactLens;
import com.xworkz.inheritance.Specs;
import com.xworkz.inheritance.VisionAid;

public class SpecsRunner {
    public static void main(String[] args) {

        Specs specs = new Specs();
        specs.correctVision();
        specs.protectEyes();
        specs.checkPower();
        specs.clean();
        specs.displayBrand();

        System.out.println("-----------------------------------------");
        VisionAid visionAid = new Specs();
        visionAid.correctVision();
        visionAid.protectEyes();
        visionAid.checkPower();
        visionAid.clean();
        visionAid.displayBrand();

        System.out.println("-----------------------------------------");
        ContactLens contactLens=new ContactLens();
        contactLens.insertLens(contactLens);
    }
}
