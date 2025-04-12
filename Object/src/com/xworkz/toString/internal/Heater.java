package com.xworkz.toString.internal;

public class Heater
{
    private String brand;
    private int heatingPower;
    private String controlType;

    public Heater(String brand, int heatingPower, String controlType) {
        this.brand = brand;
        this.heatingPower = heatingPower;
        this.controlType = controlType;
    }
    @Override
    public String toString() {
        return "RoomHeater{brand='" + brand + "', heatingPower=" + heatingPower + "W, controlType='" + controlType + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -310;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Heater) {
                System.out.println("Ref is Heater, will compare...");
                Heater heater1 = this;
                Heater heater2 = (Heater) obj;
                if (heater1.brand.equals(heater2.brand) && heater1.heatingPower == heater2.heatingPower ) {
                    System.out.println("Both Heaters have the same brand, heating power, and control type");
                    return true;
                }
            }
        }
        return false;
    }
}
