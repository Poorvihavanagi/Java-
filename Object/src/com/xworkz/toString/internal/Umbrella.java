package com.xworkz.toString.internal;

public class Umbrella {
    private int ribCount;
    private String windResistance;
    private String openMechanism;

    public Umbrella(int ribCount, String windResistance, String openMechanism) {
        this.ribCount = ribCount;
        this.windResistance = windResistance;
        this.openMechanism = openMechanism;
    }

    @Override
    public String toString() {
        return "Umbrella{" + "Rib Count=" + ribCount + ", Wind Resistance='" + windResistance + "'" + ", Open Mechanism='" + openMechanism + "'" + '}';
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 979;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Umbrella) {
                System.out.println("Ref is Umbrella, will compare...");
                Umbrella umbrella1 = this;
                Umbrella umbrella2 = (Umbrella) obj;
                if (umbrella1.ribCount == umbrella2.ribCount && umbrella1.windResistance.equals(umbrella2.windResistance) && umbrella1.openMechanism.equals(umbrella2.openMechanism)) {
                    System.out.println("Both Umbrellas are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
