package com.xworkz.toString.internal;

public class DeskOrganizer {
    private String type;
    private int compartments;
    private String material;

    public DeskOrganizer(String type, int compartments, String material) {
        this.type = type;
        this.compartments = compartments;
        this.material = material;
    }
    @Override
    public String toString() {
        return "DeskOrganizer{Type='" + type + "', Compartments=" + compartments + ", Material='" + material + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return -200;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof DeskOrganizer) {
                System.out.println("Ref is DeskOrganizer, will compare...");
                DeskOrganizer organizer1 = this;
                DeskOrganizer organizer2 = (DeskOrganizer) obj;
                if (organizer1.type.equals(organizer2.type)) {
                    System.out.println("Both DeskOrganizers have the same type");
                    return true;
                }
            }
        }
        return false;
    }
}