package com.xworkz.toString.internal;

public class Comb {
    private String type;
    private String material;
    private int teethCount;

    public Comb(String type, String material, int teethCount) {
        this.type = type;
        this.material = material;
        this.teethCount = teethCount;
    }

    @Override
    public String toString() {
        return "Comb{Type='" + type + "', Material='" + material + "', Teeth Count=" + teethCount + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -160;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Comb) {
                System.out.println("Ref is Comb, will compare...");
                Comb comb1 = this;
                Comb comb2 = (Comb) obj;
                if (comb1.type.equals(comb2.type)) {
                    System.out.println("Both Combs have the same type");
                    return true;
                }
            }
        }
        return false;
    }

}
