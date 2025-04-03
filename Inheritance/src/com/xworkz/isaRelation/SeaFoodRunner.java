package com.xworkz.isaRelation;

import com.xworkz.inheritance.SeaFood;
import com.xworkz.inheritance.Shrimp;

public class SeaFoodRunner {
    public static void main(String[] args) {
        Shrimp shrimp = new Shrimp();
        shrimp.cook();
        shrimp.eat();
        shrimp.store();
        shrimp.checkFreshness();
        shrimp.season();
        System.out.println("---------------------------------------------------------");
        SeaFood seafood = new Shrimp();
        seafood.cook();
        seafood.eat();
        seafood.store();
        seafood.checkFreshness();
        seafood.season();
    }
}
