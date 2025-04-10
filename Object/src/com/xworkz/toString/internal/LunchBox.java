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
}