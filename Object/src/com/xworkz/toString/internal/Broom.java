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

    public String toString() {
        return "Broom{BristleType='" + bristleType + "', HandleLength='" + handleLength + "', Usage='" + usage + "'}";
    }
}
