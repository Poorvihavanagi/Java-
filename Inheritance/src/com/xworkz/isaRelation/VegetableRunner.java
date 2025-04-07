
package com.xworkz.isaRelation;

import com.xworkz.inheritance.Carrot;
import com.xworkz.inheritance.Spinach;
import com.xworkz.inheritance.Vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        Carrot carrot = new Carrot();
        carrot.grow();
        carrot.harvest();
        carrot.wash();
        carrot.chop();
        carrot.cook();

        System.out.println("---------------------------------------------------------------");

        Vegetable vegetable = new Carrot();
        vegetable.grow();
        vegetable.harvest();
        vegetable.wash();
        vegetable.chop();
        vegetable.cook();

        System.out.println("---------------------------------------------------------------");

        Spinach spinach=new Spinach();
        spinach.makeSoup(vegetable);
    }
}
