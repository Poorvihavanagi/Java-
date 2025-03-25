package com.xworkz.accessorsAndMutators;

public class Satellite
{
    private SatelliteType satelliteType;
    private double cost;
    private double weight;
    private double loadCapacity;

    public SatelliteType getSatelliteType(){
        return this.satelliteType;
    }
    public void setSatelliteType(SatelliteType satelliteType){
        this.satelliteType=satelliteType;
    }
    public double getCost(){
        return this.cost;
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public double getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity=loadCapacity;
    }
}
