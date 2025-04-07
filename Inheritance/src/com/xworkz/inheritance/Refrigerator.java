package com.xworkz.inheritance;

public class Refrigerator extends Appliances{
    public void drainWater(){
        System.out.println(
                "Washing machine is draining the water"
        );
    }
    public void coolItems(Appliances appliances){
        if(appliances instanceof Refrigerator){
            System.out.println("Appliances is instance of refrigerator");
            Refrigerator refrigerator=(Refrigerator) appliances;
            refrigerator.drainWater();
        }
    }
}
