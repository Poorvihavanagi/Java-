package com.xworkz.toString.internal;

public class Broom {
    private String bristleType;
    private String handleLength;
    private String usage;

    public Broom(String bristleType, String handleLength, String usage) {
        this.bristleType = bristleType;
        this.handleLength = handleLength;
        this.usage = usage;
    }
    @Override
    public String toString() {
        return "Broom{BristleType='" + bristleType + "', HandleLength='" + handleLength + "', Usage='" + usage + "'}";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -50;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Broom) {
                System.out.println("Ref is Broom, will compare...");
                Broom broom1 = this;
                Broom broom2 = (Broom) obj;
                if (broom1.bristleType.equals(broom2.bristleType)) {
                    System.out.println("Both brooms have the same bristle type");
                    return true;
                }
            }
        }
        return false;
    }
}
