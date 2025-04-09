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

    public String toString() {
        return "Router{" + "brand='" + brand + '\'' + ", frequencyBand='" + frequencyBand + '\'' + ", numberOfPorts=" + numberOfPorts + '}';
    }
}