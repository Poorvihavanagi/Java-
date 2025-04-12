package com.xworkz.toString.internal;

public class GasStove {
    private String brand;
    private int burners;
    private String ignitionType;

    public GasStove(String brand, int burners, String ignitionType) {
        this.brand = brand;
        this.burners = burners;
        this.ignitionType = ignitionType;
    }
    @Override
    public String toString() {
        return "GasStove{Brand='" + brand + "', Burners=" + burners + ", IgnitionType='" + ignitionType + "'}";
    }

    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -260;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof GasStove) {
                System.out.println("Ref is GasStove, will compare...");
                GasStove gs1 = this;
                GasStove gs2 = (GasStove) obj;
                if (gs1.brand.equals(gs2.brand) && gs1.burners==gs2.burners) {  // Compare only the brand
                    System.out.println("Both GasStoves have the same brand");
                    return true;
                }
            }
        }
        return false;
    }
}