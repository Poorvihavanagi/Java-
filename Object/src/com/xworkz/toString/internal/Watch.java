package com.xworkz.toString.internal;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public String toString() {
        return "Watch{Brand='" + brand + "', Type='" + type + "', Price=" + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 967;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Watch) {
                System.out.println("Ref is Watch, will compare...");
                Watch watch1 = this;
                Watch watch2 = (Watch) obj;
                if (watch1.brand.equals(watch2.brand) && watch1.type.equals(watch2.type) && watch1.price == watch2.price) {
                    System.out.println("Both Watches are identical");
                    return true;
                }
            }
        }
        return false;
    }
}