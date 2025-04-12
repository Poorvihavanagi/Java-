package com.xworkz.toString.internal;

public class Chair {
    private String material;
    private String color;
    private int height;

    public Chair(String material, String color, int height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Chair{Material='" + material + "', Color='" + color + "', Height=" + height + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " +super.hashCode());
        return -100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chair) {
                System.out.println("Ref is Chair, will compare...");
                Chair c1 = this;
                Chair c2 = (Chair) obj;
                if (c1.material.equals(c2.material) ) {
                    System.out.println("Both Chairs have same material and color");
                    return true;
                }
            }
        }
        return false;
    }

}
