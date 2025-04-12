package com.xworkz.toString.internal;

public class Mat {
    private String material;
    private String color;
    private String size;

    public Mat(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }
    @Override
    public String toString() {
        return "FloorMat{Material='" + material + "', Color='" + color + "', Size='" + size + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 570;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mat) {
                System.out.println("Ref is Mat, will compare...");
                Mat mat1 = this;
                Mat mat2 = (Mat) obj;
                if (mat1.material.equals(mat2.material) && mat1.color.equals(mat2.color)) {
                    System.out.println("Both Mats are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
