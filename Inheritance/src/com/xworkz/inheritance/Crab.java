package com.xworkz.inheritance;

public class Crab extends SeaFood{
    public void peel(){
        System.out.println("Peeling the shrimp shell");
    }

    public void boil(SeaFood seaFood){
        seaFood.checkFreshness();
        seaFood.eat();
        seaFood.cook();
        seaFood.season();
        seaFood.store();

        if(seaFood instanceof Crab){
            System.out.println("Sea food is instance of crab");
            Crab crab=(Crab) seaFood;
            crab.peel();
        }
    }
}
