package com.xworkz.toString.internal;

public class MusicalInstrument {
    private String name;
    private String type;
    private double price;

    public MusicalInstrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{Name: " + name + ", Type: " + type + ", Price: " + price + "}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -660;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof MusicalInstrument) {
                System.out.println("Ref is MusicalInstrument, will compare...");
                MusicalInstrument m1 = this;
                MusicalInstrument m2 = (MusicalInstrument) obj;
                if (m1.name.equals(m2.name) && m1.type.equals(m2.type)) {
                    System.out.println("Both MusicalInstruments are identical");
                    return true;
                }
            }
        }
        return false;
    }

}
