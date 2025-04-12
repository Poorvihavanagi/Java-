package com.xworkz.toString.internal;

public class HairDryer {
    private String brand;
    private int power;
    private String color;

    public HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }
    @Override
    public String toString() {
        return "HairDryer{brand='" + brand + "', power=" + power + "W, color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -300;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof HairDryer) {
                System.out.println("Ref is HairDryer, will compare...");
                HairDryer hairDryer1 = this;
                HairDryer hairDryer2 = (HairDryer) obj;
                if (hairDryer1.brand.equals(hairDryer2.brand) && hairDryer1.power == hairDryer2.power)  {
                    System.out.println("Both Hairdryer have the same");
                    return true;
                }
            }
        }
        return false;
    }
}
