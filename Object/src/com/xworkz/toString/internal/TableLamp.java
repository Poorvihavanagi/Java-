package com.xworkz.toString.internal;

public class TableLamp {
    private String lampType;
    private int brightnessLevel;
    private String color;

    public TableLamp(String lampType, int brightnessLevel, String color) {
        this.lampType = lampType;
        this.brightnessLevel = brightnessLevel;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TableLamp{Lamp Type='" + lampType + "', Brightness Level=" + brightnessLevel + ", Color='" + color + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 6;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof TableLamp) {
                System.out.println("Ref is TableLamp, will compare...");
                TableLamp lamp1 = this;
                TableLamp lamp2 = (TableLamp) obj;
                if (lamp1.lampType.equals(lamp2.lampType) && lamp1.brightnessLevel == lamp2.brightnessLevel && lamp1.color.equals(lamp2.color)) {
                    System.out.println("Both table lamps are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
