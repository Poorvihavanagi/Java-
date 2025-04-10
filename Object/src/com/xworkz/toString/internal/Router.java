package com.xworkz.toString.internal;

public class Router {
    private String brand;
    private String frequencyBand;
    private int numberOfPorts;

    public Router(String brand, String frequencyBand, int numberOfPorts) {
        this.brand = brand;
        this.frequencyBand = frequencyBand;
        this.numberOfPorts = numberOfPorts;
    }
    @Override
    public String toString() {
        return "Router{" + "brand='" + brand + '\'' + ", frequencyBand='" + frequencyBand + '\'' + ", numberOfPorts=" + numberOfPorts + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 97;
    }
}