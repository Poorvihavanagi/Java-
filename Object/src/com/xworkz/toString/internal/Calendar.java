package com.xworkz.toString.internal;

public class Calendar
{
    private int year;
    private String type;
    private String theme;

    public Calendar(int year, String type, String theme) {
        this.year = year;
        this.type = type;
        this.theme = theme;
    }

    public String toString() {
        return "Calendar{" + "year=" + year + ", type='" + type + '\'' + ", theme='" + theme + '\'' + '}';
    }
}
