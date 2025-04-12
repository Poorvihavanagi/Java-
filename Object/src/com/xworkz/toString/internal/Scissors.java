package com.xworkz.toString.internal;

public class Scissors {
    private String brand;
    private String type;
    private int length;

    public Scissors(String brand, String type, int length) {
        this.brand = brand;
        this.type = type;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Scissors{Brand='" + brand + "', Type='" + type + "', Length=" + length + "cm}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 69;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Scissors) {
                System.out.println("Ref is Scissors, will compare...");
                Scissors scissor1 = this;
                Scissors scissor2 = (Scissors) obj;
                if (scissor1.brand.equals(scissor2.brand) &&
                        scissor1.type.equals(scissor2.type) &&
                        scissor1.length == scissor2.length) {
                    System.out.println("Both scissors are identical");
                    return true;
                }
            }
        }
        return false;
    }
}