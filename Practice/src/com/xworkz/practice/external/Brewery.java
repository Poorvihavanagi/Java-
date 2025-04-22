package com.xworkz.practice.external;

import com.xworkz.practice.internal.BreweryOperations;

public class Brewery {
    private BreweryOperations breweryOperations;

    public Brewery(BreweryOperations breweryOperations){
        this.breweryOperations=breweryOperations;
        System.out.println("Paramterized const");
    }
    public void brewSeasonalBatch(){
        if(this.breweryOperations!=null){
            System.out.println("Not null");
            this.breweryOperations.brewBeer();
        }
        else {
            System.out.println("It is null");
        }
    }
}
