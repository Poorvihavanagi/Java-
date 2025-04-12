package com.xworkz.toString.internal;

public class Television {
    private String brand;
    private int size;
    private String type;

    public Television(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public String toString() {
        return "Television{Brand='" + brand + "', Size=" + size + " inch, Type='" + type + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 80;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Television) {
                System.out.println("Ref is Television, will compare...");
                Television tv1 = this;
                Television tv2 = (Television) obj;
                if (tv1.brand.equals(tv2.brand) && tv1.size == tv2.size && tv1.type.equals(tv2.type)) {
                    System.out.println("Both televisions are identical");
                    return true;
                }
            }
        }
        return false;
    }
}