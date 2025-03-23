package com.xworkz.nonPrimitiveTypes;

public class Rocket
{
    void launch(Fuel fuel){
        if(fuel!=null){
            System.out.println("Fuel in Rocket");
            fuel.burn();
        }
        else{
            System.out.println("Fuel not running in Rocket");
        }
    }
}
