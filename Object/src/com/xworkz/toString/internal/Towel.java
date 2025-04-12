package com.xworkz.toString.internal;

public class Towel {
    private String material;
    private String size;
    private String color;

    public Towel(String material, String size, String color) {
        this.material = material;
        this.size = size;
        this.color = color;
    }

    public String toString() {
        return "Towel{Material='" + material + "', Size='" + size + "', Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 927;
    } @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Towel) {
                System.out.println("Ref is Towel, will compare...");
                Towel towel1 = this;
                Towel towel2 = (Towel) obj;
                if (towel1.material.equals(towel2.material) && towel1.size.equals(towel2.size) && towel1.color.equals(towel2.color)) {
                    System.out.println("Both towels are identical");
                    return true;
                }
            }
        }
        return false;
    }

}