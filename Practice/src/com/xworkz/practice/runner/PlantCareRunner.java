package com.xworkz.practice.runner;

import com.xworkz.practice.external.GardeningService;
import com.xworkz.practice.internal.PlantCare;
import com.xworkz.practice.internal.UrbanGardenerImpl;

public class PlantCareRunner {
    public static void main(String[] args) {
        PlantCare plantCare=new UrbanGardenerImpl();
        GardeningService gardeningService=new GardeningService(plantCare);
        gardeningService.prunePlants();
    }
}
