package com.xworkz.toString.internal;

public class GlassCleaner {
    private String brand;
    private int volume;
    private String scent;

    public GlassCleaner(String brand, int volume, String scent) {
        this.brand = brand;
        this.volume = volume;
        this.scent = scent;
    }
    @Override
    public String toString() {
        return "GlassCleaner{Brand='" + brand + "', Volume=" + volume + "ml, Scent='" + scent + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -270;
    }
}