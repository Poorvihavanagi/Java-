package com.xworkz.toString.internal;

public class Screwdriver {
    private String type;
    private String handleMaterial;
    private double length;

    public Screwdriver(String type, String handleMaterial, double length) {
        this.type = type;
        this.handleMaterial = handleMaterial;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Screwdriver{Type='" + type + "', HandleMaterial='" + handleMaterial + "', Length=" + length + "cm}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 100;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Screwdriver) {
                System.out.println("Ref is Screwdriver, will compare...");
                Screwdriver screwdriver1 = this;
                Screwdriver screwdriver2 = (Screwdriver) obj;
                if (screwdriver1.type.equals(screwdriver2.type) && screwdriver1.handleMaterial.equals(screwdriver2.handleMaterial) && screwdriver1.length == screwdriver2.length) {
                    System.out.println("Both screwdrivers are identical");
                    return true;
                }
            }
        }
        return false;
    }
}