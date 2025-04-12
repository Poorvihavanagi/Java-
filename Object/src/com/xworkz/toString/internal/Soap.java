package com.xworkz.toString.internal;

public class Soap {
    private String brand;
    private String scent;
    private int weight;

    public Soap(String brand, String scent, int weight) {
        this.brand = brand;
        this.scent = scent;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Soap{Brand='" + brand + "', Scent='" + scent + "', Weight=" + weight + "g}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 55;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Soap) {
                System.out.println("Ref is Soap, will compare...");
                Soap soap1 = this;
                Soap soap2 = (Soap) obj;
                if (soap1.brand.equals(soap2.brand) &&
                        soap1.scent.equals(soap2.scent) &&
                        soap1.weight == soap2.weight) {
                    System.out.println("Both soaps are identical");
                    return true;
                }
            }
        }
        return false;
    }
}