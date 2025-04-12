package com.xworkz.toString.internal;

public class LunchBox {
    private String brand;
    private int containers;
    private String insulationType;

    public LunchBox(String brand, int containers, String insulationType) {
        this.brand = brand;
        this.containers = containers;
        this.insulationType = insulationType;
    }
    @Override
    public String toString() {
        return "LunchBox{Brand='" + brand + "', Containers=" + containers + ", InsulationType='" + insulationType + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 530;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof LunchBox) {
                System.out.println("Ref is LunchBox, will compare...");
                LunchBox box1 = this;
                LunchBox box2 = (LunchBox) obj;
                if (box1.brand.equals(box2.brand) && box1.containers == box2.containers && box1.insulationType.equals(box2.insulationType)) {
                    System.out.println("Both LunchBoxes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}