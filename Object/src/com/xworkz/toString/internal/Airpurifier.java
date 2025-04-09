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

    public String toString() {
        return "AirPurifier{Brand='" + brand + "', Filter Type='" + filterType + "', Area Coverage=" + areaCoverage + "sqft}";
    }
}
