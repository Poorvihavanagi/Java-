package com.xworkz.toString.internal;

public class IronBox {
    private String brand;
    private int wattage;
    private String color;

    public IronBox(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
    }

    @Override
    public String toString() {
        return "IronBox{Brand='" + brand + "', Wattage=" + wattage + "W, Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -340;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof IronBox) {
                System.out.println("Ref is IronBox, will compare...");
                IronBox ironBox1 = this;
                IronBox ironBox2 = (IronBox) obj;
                if (ironBox1.brand.equals(ironBox2.brand) && ironBox1.wattage == ironBox2.wattage ) {
                    System.out.println("Both IronBoxes have the same brand, wattage, and color");
                    return true;
                }
            }
        }
        return false;
    }

}
