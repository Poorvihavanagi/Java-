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
}
