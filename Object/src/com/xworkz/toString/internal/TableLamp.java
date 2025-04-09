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
}
