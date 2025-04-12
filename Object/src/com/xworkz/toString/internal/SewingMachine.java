package com.xworkz.toString.internal;

public class SewingMachine {
    private String brand;
    private String stitchType;
    private int motorPower;

    public SewingMachine(String brand, String stitchType, int motorPower) {
        this.brand = brand;
        this.stitchType = stitchType;
        this.motorPower = motorPower;
    }
    @Override
    public String toString() {
        return "SewingMachine{" + "brand='" + brand + '\'' + ", stitchType='" + stitchType + '\'' + ", motorPower=" + motorPower + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 45;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof SewingMachine) {
                System.out.println("Ref is SewingMachine, will compare...");
                SewingMachine machine1 = this;
                SewingMachine machine2 = (SewingMachine) obj;
                if (machine1.brand.equals(machine2.brand) && machine1.stitchType.equals(machine2.stitchType) && machine1.motorPower == machine2.motorPower) {
                    System.out.println("Both sewing machines are identical");
                    return true;
                }
            }
        }
        return false;
    }
}