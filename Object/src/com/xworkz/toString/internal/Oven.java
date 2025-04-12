package com.xworkz.toString.internal;

public class Oven {
    private String modelNumber;
    private boolean hasGrill;
    private int powerConsumption;

    public Oven(String modelNumber, boolean hasGrill, int powerConsumption) {
        this.modelNumber = modelNumber;
        this.hasGrill = hasGrill;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Oven{Model Number: " + modelNumber + ", Has Grill: " + hasGrill + ", Power Consumption: " + powerConsumption + "W}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -710;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Oven) {
                System.out.println("Ref is Oven, will compare...");
                Oven oven1 = this;
                Oven oven2 = (Oven) obj;
                if (oven1.modelNumber.equals(oven2.modelNumber) && oven1.hasGrill == oven2.hasGrill) {
                    System.out.println("Both Ovens are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
