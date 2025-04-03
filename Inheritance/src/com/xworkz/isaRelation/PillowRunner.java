package com.xworkz.isaRelation;

import com.xworkz.inheritance.Bedding;
import com.xworkz.inheritance.Pillow;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow();
        pillow.provideComfort();
        pillow.supportHead();
        pillow.adjustPosition();
        pillow.checkMaterial();
        pillow.clean();

        System.out.println("--------------------------------------");
        Bedding bedding = new Pillow();
        bedding.provideComfort();
        bedding.supportHead();
        bedding.adjustPosition();
        bedding.checkMaterial();
        bedding.clean();
    }
}
