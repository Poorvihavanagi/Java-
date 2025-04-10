package com.xworkz.toString.internal;

public class Projector {
    private String brand;
    private int lumens;
    private String resolution;

    public Projector(String brand, int lumens, String resolution) {
        this.brand = brand;
        this.lumens = lumens;
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return "Projector{" + "brand='" + brand  + ", Lumens='" + lumens  + ", Resolution=" + resolution + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 583;
    }

}
