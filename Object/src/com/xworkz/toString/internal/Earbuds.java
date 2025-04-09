package com.xworkz.toString.internal;

public class Earbuds {
    private String brand;
    private int batteryLife;
    private String noiseCancellation;

    public Earbuds(String brand, int batteryLife, String noiseCancellation) {
        this.brand = brand;
        this.batteryLife = batteryLife;
        this.noiseCancellation = noiseCancellation;
    }

    @Override
    public String toString() {
        return "Earbuds{Brand='" + brand + "', Battery Life=" + batteryLife + "hrs, Noise Cancellation='" + noiseCancellation + "'}";
    }
}
