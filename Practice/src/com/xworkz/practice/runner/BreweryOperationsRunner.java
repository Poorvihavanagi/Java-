package com.xworkz.practice.runner;

import com.xworkz.practice.external.Brewery;
import com.xworkz.practice.internal.BreweryOperations;
import com.xworkz.practice.internal.HeinekenBreweryImpl;

public class BreweryOperationsRunner {
    public static void main(String[] args) {
        BreweryOperations breweryOperations=new HeinekenBreweryImpl();
        Brewery brewery=new Brewery(breweryOperations);
        brewery.brewSeasonalBatch();
    }
}
