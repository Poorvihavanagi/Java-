package com.xworkz.toString.internal;

public class Shampoo {
    private String brand;
    private String type;
    private int volume;

    public Shampoo(String brand, String type, int volume) {
        this.brand = brand;
        this.type = type;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Shampoo{Brand='" + brand + "', Type='" + type + "', Volume=" + volume + "ml}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 97;
    }
}