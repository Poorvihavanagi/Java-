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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof TissueBox) {
                System.out.println("Ref is TissueBox, will compare...");
                TissueBox box1 = this;
                TissueBox box2 = (TissueBox) obj;
                if (box1.brand.equals(box2.brand) && box1.sheetCount == box2.sheetCount && box1.material.equals(box2.material)) {
                    System.out.println("Both tissue boxes are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
