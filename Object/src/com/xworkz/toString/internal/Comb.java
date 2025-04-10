package com.xworkz.toString.internal;

public class Comb {
    private String type;
    private String material;
    private int teethCount;

    public Comb(String type, String material, int teethCount) {
        this.type = type;
        this.material = material;
        this.teethCount = teethCount;
    }

    @Override
    public String toString() {
        return "Comb{Type='" + type + "', Material='" + material + "', Teeth Count=" + teethCount + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -160;
    }
}
