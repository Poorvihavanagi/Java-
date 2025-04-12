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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Spoon) {
                System.out.println("Ref is Spoon, will compare...");
                Spoon spoon1 = this;
                Spoon spoon2 = (Spoon) obj;
                if (spoon1.material.equals(spoon2.material) && spoon1.type.equals(spoon2.type) && spoon1.length == spoon2.length) {
                    System.out.println("Both spoons are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
