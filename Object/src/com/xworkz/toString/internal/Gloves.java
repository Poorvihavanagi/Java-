package com.xworkz.toString.internal;

public class Gloves {
    private String material;
    private String size;
    private String usageType;

    public Gloves(String material, String size, String usageType) {
        this.material = material;
        this.size = size;
        this.usageType = usageType;
    }

    public String toString() {
        return "Gloves{material='" + material + "', size='" + size + "', usageType='" + usageType + "'}";
    }
}
