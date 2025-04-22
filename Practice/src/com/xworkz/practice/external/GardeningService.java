package com.xworkz.practice.external;

import com.xworkz.practice.internal.PlantCare;

public class GardeningService {
    private PlantCare plantCare;

    public GardeningService(PlantCare plantCare){
        this.plantCare=plantCare;
        System.out.println("Gardening service is paramterized const");
    }
    public void prunePlants(){
        if(this.plantCare!=null){
            System.out.println("Not null");
            this.plantCare.maintainGarden();
        }
        else{
            System.out.println("It is null");
        }
    }
}
