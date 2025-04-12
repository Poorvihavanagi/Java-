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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Jug) {
                System.out.println("Ref is Jug, will compare...");
                Jug jug1 = this;
                Jug jug2 = (Jug) obj;
                if (jug1.design.equals(jug2.design) && jug1.material.equals(jug2.material)) {
                    System.out.println("Both Jugs are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
