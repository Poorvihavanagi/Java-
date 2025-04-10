package com.xworkz.toString.internal;

public class Micorwave {

    private String brand;
    private int volume;
    private boolean hasGrill;

    public Micorwave(String brand, int volume, boolean hasGrill) {
        this.brand = brand;
        this.volume = volume;
        this.hasGrill = hasGrill;
    }
    @Override
    public String toString() {
        return "Microwave{Brand='" + brand + "', Volume=" + volume + "L, Has Grill=" + hasGrill + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 590;
    }
}
