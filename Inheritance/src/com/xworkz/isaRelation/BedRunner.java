package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bed;
import com.xworkz.inheritance.Cushion;

public class BedRunner {
    public static void main(String[] args) {

        Cushion cushion = new Cushion();
        cushion.sleep();
        cushion.makeBed();
        cushion.checkComfort();
        cushion.fold();
        cushion.move();

        System.out.println("-----------------------------------------------------------");
        Bed bed = new Cushion();
        bed.sleep();
        bed.makeBed();
        bed.checkComfort();
        bed.fold();
        bed.move();
    }
}
