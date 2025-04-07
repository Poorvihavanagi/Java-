package com.xworkz.isaRelation;

import com.xworkz.inheritance.Lipstick;
import com.xworkz.inheritance.NailPolish;
import com.xworkz.inheritance.BeautyProduct;

public class NailPolishRunner {
    public static void main(String[] args) {
        BeautyProduct beautyProduct = new BeautyProduct();
        beautyProduct.apply();
        beautyProduct.remove();
        beautyProduct.dry();
        beautyProduct.checkColor();
        beautyProduct.shake();

        System.out.println("---------------------------------------------------------------");
        NailPolish nailPolish = new BeautyProduct();
        nailPolish.apply();
        nailPolish.remove();
        nailPolish.dry();
        nailPolish.checkColor();
        nailPolish.shake();

        System.out.println("-----------------------------------------------------------------");
        Lipstick lipstick = new Lipstick();
        lipstick.shine(lipstick);
    }
}
