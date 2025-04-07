package com.xworkz.inheritance;

public class Lipstick extends BeautyProduct{

    public void wipe(){
        System.out.println("Applying lipstick on lips");
    }
    public void shine(BeautyProduct beautyProduct){
        beautyProduct.apply();
        beautyProduct.remove();
        beautyProduct.dry();
        beautyProduct.checkColor();
        beautyProduct.shake();

        if(beautyProduct instanceof NailPolish ){
            System.out.println("beauty product is an instance of nail polish");
            Lipstick lipstick=(Lipstick) beautyProduct;
            lipstick.wipe();
        }
    }
}
