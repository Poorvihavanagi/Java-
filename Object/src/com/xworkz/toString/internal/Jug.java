package com.xworkz.toString.internal;

public class Jug {
    private String design;
    private String material;
    private boolean hasLid;

    public Jug(String design, String material, boolean hasLid) {
        this.design = design;
        this.material = material;
        this.hasLid = hasLid;
    }

    @Override
    public String toString() {
        return "Jug{" + "Design='" + design + "'" + ", Material='" + material + "'" + ", Has Lid=" + hasLid + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -360;
    }
}
