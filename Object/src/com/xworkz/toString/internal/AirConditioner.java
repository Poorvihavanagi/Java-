package com.xworkz.toString.internal;

public class AirConditioner {
    private String brand;
    private double tonnage;
    private String coolingTechnology;

    public AirConditioner(String brand, double tonnage, String coolingTechnology) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.coolingTechnology = coolingTechnology;
    }

    @Override
    public String toString() {
        return "AirConditioner{Brand='" + brand + "', Tonnage=" + tonnage + "T, Cooling Technology='" + coolingTechnology + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " +super.hashCode());
        return -89;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            System.out.println("Ref is not null");
            if(obj instanceof AirConditioner){
                System.out.println("Ref is AC, will compare....");
                AirConditioner airConditioner1=this;
                AirConditioner airConditioner2=(AirConditioner) obj;
                if(airConditioner1.brand.equals(airConditioner2.brand)) {
                    System.out.println("Both AC's are same brand ");
                    return true;
                }
            }
        }
        return false;
    }
}
