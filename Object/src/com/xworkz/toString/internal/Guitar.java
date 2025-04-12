package com.xworkz.toString.internal;

public class Guitar {
    private String type;
    private int numberOfStrings;
    private String brand;

    public Guitar(String type, int numberOfStrings, String brand) {
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Guitar{" + "type='" + type + '\'' + ", numberOfStrings=" + numberOfStrings + ", brand='" + brand + '\'' + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -290;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Guitar) {
                System.out.println("Ref is Guitar, will compare...");
                Guitar guitar1 = this;
                Guitar guitar2 = (Guitar) obj;
                if (guitar1.brand.equals(guitar2.brand) && guitar1.type == guitar2.type)  {  // Compare only the brand
                    System.out.println("Both guitars have the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}