package com.xworkz.toString.internal;

public class Spoon {
    private String material;
    private String type;
    private int length;

    public Spoon(String material, String type, int length) {
        this.material = material;
        this.type = type;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Spoon{material='" + material + "', type='" + type + "', length=" + length + "cm}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 36;
    }
}
