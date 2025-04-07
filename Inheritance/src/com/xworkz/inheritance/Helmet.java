package com.xworkz.inheritance;

public class Helmet extends ProtectiveGear{
    public void sanitize(){
        System.out.println("Sanitizing the gloves after use");
    }
    public void cleanHelmet(ProtectiveGear protectiveGear){
        protectiveGear.checkMaterial();
        protectiveGear.remove();
        protectiveGear.store();
        protectiveGear.wash();
        protectiveGear.wear();

        if(protectiveGear instanceof Helmet){
            System.out.println("protective gear is instances of helmet");
            Helmet helmet=(Helmet) protectiveGear;
            helmet.sanitize();
        }
    }
}
