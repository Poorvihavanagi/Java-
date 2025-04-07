package com.xworkz.isaRelation;

import com.xworkz.inheritance.Cloth;
import com.xworkz.inheritance.Napkin;
import com.xworkz.inheritance.Towel;

public class NapkinRunner {
    public static void main(String[] args) {

        Napkin napkin = new Napkin();
        napkin.absorb();
        napkin.clean();
        napkin.fold();
        napkin.dry();
        napkin.reuse();

        System.out.println("----------------------------------------------------");
        Cloth cloth = new Napkin();
        cloth.absorb();
        cloth.clean();
        cloth.fold();
        cloth.dry();
        cloth.reuse();

        System.out.println("----------------------------------------------------");
        Towel towel=new Towel();
        towel.dryBody(towel);
    }
}
