package com.xworkz.practice.external;

import com.xworkz.practice.internal.VoyageManager;

public class CruiseShip {
    private VoyageManager voyageManager;

    public CruiseShip(VoyageManager voyageManager){
        this.voyageManager=voyageManager;
        System.out.println("Parameterized const cruiseship");
    }
    public void planExcursion(){
        if(this.voyageManager!=null){
            this.voyageManager.bookCruise();
            System.out.println("Not null voyage manager");
        }
        else{
            System.out.println("It is null");
        }
    }
}
