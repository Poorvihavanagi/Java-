package com.xworkz.isaRelation;

import com.xworkz.inheritance.HairCare;
import com.xworkz.inheritance.HerbalShampoo;
import com.xworkz.inheritance.Shampoo;

public class ShampooRunner
{
    public static void main(String[] args) {
        HairCare hairCare = new HairCare();
        hairCare.cleanse();
        hairCare.lather();
        hairCare.rinse();
        hairCare.nourish();
        hairCare.fragrance();

        System.out.println("-------------------------------------------");

        Shampoo shampoo = new HairCare();
        shampoo.cleanse();
        shampoo.lather();
        shampoo.rinse();
        shampoo.nourish();
        shampoo.fragrance();

        System.out.println("-------------------------------------------");
        HerbalShampoo herbalShampoo=new HerbalShampoo();
        herbalShampoo.applyHerbs(herbalShampoo);

    }
}
