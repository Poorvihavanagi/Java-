package com.xworkz.toString.internal;

public class TissueBox {
    private String brand;
    private int sheetCount;
    private String material;

    public TissueBox(String brand, int sheetCount, String material) {
        this.brand = brand;
        this.sheetCount = sheetCount;
        this.material = material;
    }

    public String toString() {
        return "TissueBox{brand='" + brand + "', sheetCount=" + sheetCount + ", material='" + material + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 36;
    }
}
