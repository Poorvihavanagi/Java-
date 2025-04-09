package com.xworkz.toString.internal;

public class GasStove {
    private String brand;
    private int burners;
    private String ignitionType;

    public GasStove(String brand, int burners, String ignitionType) {
        this.brand = brand;
        this.burners = burners;
        this.ignitionType = ignitionType;
    }

    public String toString() {
        return "GasStove{Brand='" + brand + "', Burners=" + burners + ", IgnitionType='" + ignitionType + "'}";
    }
}