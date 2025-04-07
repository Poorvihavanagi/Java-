package com.xworkz.isaRelation;

import com.xworkz.inheritance.Cosmetic;
import com.xworkz.inheritance.Makeup;
import com.xworkz.inheritance.Skincare;

public class CosmeticRunner {
    public static void main(String[] args) {

        Makeup makeup = new Makeup();
        makeup.apply();
        makeup.remove();
        makeup.checkIngredients();
        makeup.smell();
        makeup.store();
        System.out.println("--------------------------------------------------");
        Cosmetic cosmetic = new Makeup();
        cosmetic.apply();
        cosmetic.remove();
        cosmetic.checkIngredients();
        cosmetic.smell();
        cosmetic.store();
        System.out.println("--------------------------------------------------");
        Skincare skincare=new Skincare();
        skincare.cleanseSkin(skincare);
    }
}
