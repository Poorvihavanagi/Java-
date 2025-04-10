
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
}
