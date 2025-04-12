package com.xworkz.toString.internal;

public class Fan {
    private String brand;
    private int speedLevel;
    private int numberOfWings;

    public Fan(String brand, int speedLevel, int numberOfWings) {
        this.brand = brand;
        this.speedLevel = speedLevel;
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return "Fan{Brand='" + brand + "', Speed Level=" + speedLevel + ", Number of Wings=" + numberOfWings + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -240;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fan) {
                System.out.println("Ref is Fan, will compare...");
                Fan f1 = this;
                Fan f2 = (Fan) obj;
                if (f1.brand.equals(f2.brand)) {
                    System.out.println("Both Fans have the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}
