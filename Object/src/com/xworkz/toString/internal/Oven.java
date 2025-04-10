package com.xworkz.toString.internal;

public class Oven {
    private String modelNumber;
    private boolean hasGrill;
    private int powerConsumption;

    public Oven(String modelNumber, boolean hasGrill, int powerConsumption) {
        this.modelNumber = modelNumber;
        this.hasGrill = hasGrill;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Oven{Model Number: " + modelNumber + ", Has Grill: " + hasGrill + ", Power Consumption: " + powerConsumption + "W}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -710;
    }
}
