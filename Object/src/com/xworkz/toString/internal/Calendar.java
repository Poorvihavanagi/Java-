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
    @Override
    public String toString() {
        return "Calendar{" + "year=" + year + ", type='" + type + '\'' + ", theme='" + theme + '\'' + '}';
    }
    @Override
    public int hashCode() {
        int original = super.hashCode();
        System.out.println("Original hash code  " + original);
        return -80;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Calendar) {
                System.out.println("Ref is Calendar, will compare...");
                Calendar c1 = this;
                Calendar c2 = (Calendar) obj;
                if (c1.year == c2.year ) {
                    System.out.println("Both Calendars are same in year and type");
                    return true;
                }
            }
        }
        return false;
    }
}
