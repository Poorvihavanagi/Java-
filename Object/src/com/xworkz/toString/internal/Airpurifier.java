package com.xworkz.toString.internal;

public class Airpurifier {
    private String brand;
    private String filterType;
    private int areaCoverage;

    public Airpurifier(String brand, String filterType, int areaCoverage) {
        this.brand = brand;
        this.filterType = filterType;
        this.areaCoverage = areaCoverage;
    }
    @Override
    public String toString() {
        return "AirPurifier{Brand='" + brand + "', Filter Type='" + filterType + "', Area Coverage=" + areaCoverage + "sqft}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hashcode: " +super.hashCode());
        return 60;
    }
}
