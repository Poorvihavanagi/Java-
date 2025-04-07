package com.xworkz.isaRelation;

import com.xworkz.inheritance.Doll;
import com.xworkz.inheritance.SoftToy;
import com.xworkz.inheritance.Toy;

public class DollRunner {
    public static void main(String[] args) {
        Doll doll = new Doll();
        doll.play();
        doll.display();
        doll.clean();
        doll.repair();
        doll.pack();

        System.out.println("----------------------------------------");
        Toy toy = new Doll();
        toy.play();
        toy.display();
        toy.clean();
        toy.repair();
        toy.pack();

        System.out.println("----------------------------------------");
        SoftToy softToy=new SoftToy();
        softToy.wash(softToy);
    }
}
