package com.xworkz.toString.internal;

public class MeasuringTape {
    private String brand;
    private int length;
    private String unit;

    public MeasuringTape(String brand, int length, String unit) {
        this.brand = brand;
        this.length = length;
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "MeasuringTape{Brand='" + brand + "', Length=" + length + unit + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 580;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof MeasuringTape) {
                System.out.println("Ref is MeasuringTape, will compare...");
                MeasuringTape tape1 = this;
                MeasuringTape tape2 = (MeasuringTape) obj;
                if (tape1.brand.equals(tape2.brand) && tape1.length == tape2.length) {
                    System.out.println("Both MeasuringTapes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}