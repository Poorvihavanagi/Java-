package com.xworkz.toString.internal;

public class Charger {
    private String type;
    private int output;
    private String brand;

    public Charger(String type, int output, String brand) {
        this.type = type;
        this.output = output;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Charger{type='" + type + "', output=" + output + "W, brand='" + brand + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -120;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Charger) {
                System.out.println("Ref is Charger, will compare...");
                Charger ch1 = this;
                Charger ch2 = (Charger) obj;
                if (ch1.brand.equals(ch2.brand)) {
                    System.out.println("Both Chargers have the same brand");
                    return true;
                }
            }
        }
        return false;
    }

}
