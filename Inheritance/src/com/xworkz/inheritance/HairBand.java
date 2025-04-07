package com.xworkz.inheritance;

public class HairBand extends Accessory{

    public void styleHair(){
        System.out.println("Styling hair using the accessory");
    }
    public void polish(Accessory accessory){
        accessory.wear();
        accessory.remove();
        accessory.checkMaterial();
        accessory.clean();
        accessory.store();

        if(accessory instanceof HairBand){
            System.out.println("accessory is an instance of hair band");
            HairBand hairBand=(HairBand) accessory;
            hairBand.styleHair();
        }
    }
}
