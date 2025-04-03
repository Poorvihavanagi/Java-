package com.xworkz.isaRelation;

import com.xworkz.inheritance.Air;
import com.xworkz.inheritance.Oxygen;

public class AirRunner {
    public static void main(String[] args) {

        Oxygen oxygen = new Oxygen();
        oxygen.flow();
        oxygen.compress();
        oxygen.expand();
        oxygen.checkPurity();
        oxygen.mix();

        System.out.println("----------------------------------------------------------------");
        Air air = new Oxygen();
        air.flow();
        air.compress();
        air.expand();
        air.checkPurity();
        air.mix();
    }
}
