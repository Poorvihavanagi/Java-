package com.xworkz.toString.internal;

public class Jacket {
    private String material;
    private String size;
    private String closureType;

    public Jacket(String material, String size, String closureType) {
        this.material = material;
        this.size = size;
        this.closureType = closureType;
    }

    @Override
    public String toString() {
        return "Jacket{Material='" + material + "', Size='" + size + "', Closure='" + closureType + "'}";
    }
}
