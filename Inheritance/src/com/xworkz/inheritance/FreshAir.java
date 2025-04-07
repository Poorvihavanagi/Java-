package com.xworkz.inheritance;

public class FreshAir extends Air{
    public void supportLife(){
        System.out.println("Oxygen supports life by enabling respiration");
    }

    public void purifyLungs(Air air){
        air.flow();
        air.compress();
        air.expand();
        air.checkPurity();
        air.mix();

        if(air instanceof FreshAir){
            System.out.println("Air is instance of fresh air");
            FreshAir freshAir=(FreshAir) air;
            freshAir.supportLife();
        }
    }
}
