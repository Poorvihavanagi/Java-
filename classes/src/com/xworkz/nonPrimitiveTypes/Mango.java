package com.xworkz.nonPrimitiveTypes;

public class Mango
{
    void pickBy(Farmer farmer){
        if(farmer!=null){
            System.out.println("Farmer picked up mango");
            farmer.harvest();
        }
        else{
            System.out.println("Farmer is null");
        }
    }
}
