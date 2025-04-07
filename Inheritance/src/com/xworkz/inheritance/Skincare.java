package com.xworkz.inheritance;

public class Skincare extends Cosmetic{
    public void chooseShade(){
        System.out.println("Choosing the right shade for your skin tone");
    }
    public void cleanseSkin(Cosmetic cosmetic){
        cosmetic.apply();
        cosmetic.remove();
        cosmetic.smell();
        cosmetic.store();
        cosmetic.checkIngredients();

        if(cosmetic instanceof Skincare){
            System.out.println("cosmetic is instance of skincare");
            Skincare skincare=(Skincare) cosmetic;
            skincare.chooseShade();
        }
    }
}
