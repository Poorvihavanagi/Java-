package com.xworkz.toString.internal;

public class Micorwave {

    private String brand;
    private int volume;
    private boolean hasGrill;

    public Micorwave(String brand, int volume, boolean hasGrill) {
        this.brand = brand;
        this.volume = volume;
        this.hasGrill = hasGrill;
    }
    @Override
    public String toString() {
        return "Microwave{Brand='" + brand + "', Volume=" + volume + "L, Has Grill=" + hasGrill + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 590;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Micorwave) {
                System.out.println("Ref is Microwave, will compare...");
                Micorwave m1 = this;
                Micorwave m2 = (Micorwave) obj;
                if (m1.brand.equals(m2.brand) && m1.volume == m2.volume) {
                    System.out.println("Both Microwaves are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
