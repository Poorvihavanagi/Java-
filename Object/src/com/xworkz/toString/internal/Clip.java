package com.xworkz.toString.internal;

public class Clip {
    private String type;
    private int count;
    private String color;

    public Clip(String type, int count, String color) {
        this.type = type;
        this.count = count;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clip{type='" + type + "', count=" + count + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return -130;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Clip) {
                System.out.println("Ref is Clip, will compare...");
                Clip c1 = this;
                Clip c2 = (Clip) obj;
                if (c1.type.equals(c2.type)) {
                    System.out.println("Both Clips have the same type");
                    return true;
                }
            }
        }
        return false;
    }


}
