
package com.xworkz.toString.internal;

public class Perfume {
    private String fragrance;
    private String brand;
    private int volume;

    public Perfume(String fragrance, String brand, int volume) {
        this.fragrance = fragrance;
        this.brand = brand;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Perfume{fragrance='" + fragrance + "', brand='" + brand + "', volume=" + volume + "ml}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -730;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Perfume) {
                System.out.println("Ref is Perfume, will compare...");
                Perfume perfume1 = this;
                Perfume perfume2 = (Perfume) obj;
                if (perfume1.fragrance.equals(perfume2.fragrance) && perfume1.brand.equals(perfume2.brand) && perfume1.volume == perfume2.volume) {
                    System.out.println("Both Perfumes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
