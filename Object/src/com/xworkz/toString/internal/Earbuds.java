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
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -230;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Earbuds) {
                System.out.println("Ref is Earbuds, will compare...");
                Earbuds e1 = this;
                Earbuds e2 = (Earbuds) obj;
                if (e1.brand.equals(e2.brand)) {
                    System.out.println("Both Earbuds are the same");
                    return true;
                }
            }
        }
        return false;
    }
}
