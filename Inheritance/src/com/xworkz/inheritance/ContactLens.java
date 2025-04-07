package com.xworkz.inheritance;

public class ContactLens extends VisionAid{
    public void cleanLenses(){
        System.out.println("Running clean lenses in specs");
    }
    public void insertLens(VisionAid visionAid) {
        visionAid.correctVision();
        visionAid.clean();
        visionAid.correctVision();
        visionAid.displayBrand();
        visionAid.checkPower();

        if(visionAid instanceof ContactLens){
            System.out.println("Vision aid is an instances of contact lens");
            ContactLens contactLens=(ContactLens) visionAid;
            contactLens.cleanLenses();
        }
    }
}
