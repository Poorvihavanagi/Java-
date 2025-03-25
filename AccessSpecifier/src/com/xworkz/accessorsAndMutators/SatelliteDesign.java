package com.xworkz.accessorsAndMutators;

public class SatelliteDesign
{
    public void satelliteProcess(Satellite satellite){
        System.out.println("Satellite services...");
        System.out.println("Satellite Type: " +satellite.getSatelliteType());
        System.out.println("Cost: " +satellite.getCost());
        System.out.println("Weight: " +satellite.getWeight());
        System.out.println("Load capacity: " +satellite.getLoadCapacity());
    }

    public void initSatelliteDesign(){
        Satellite satellite = new Satellite();
        satellite.setSatelliteType(SatelliteType.WEATHER);
        satellite.setCost(15000000.50);
        satellite.setWeight(1200.75);
        satellite.setLoadCapacity(500.25);

        satelliteProcess(satellite);
    }
}
