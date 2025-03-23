package com.xworkz.country;

public class Portfolio
{
    String department;
    long budget;
    int duration;
    String ministerInCharge;

    House[] houses = {
            new House("Minister's Official Residence"),
            new House("Guest House"),
            new House("Summer Retreat"),
            new House("Conference Hall"),
            new House("Administrative Block")
    };

    Portfolio(String department, long budget, int duration, String ministerInCharge) {
        this.department = department;
        this.budget = budget;
        this.duration = duration;
        this.ministerInCharge = ministerInCharge;
    }

    void display() {
        System.out.println("Portfolio Department: " + department);
        System.out.println("Budget: " + budget);
        System.out.println("Duration (Years): " + duration);
        System.out.println("Minister In Charge: " + ministerInCharge);

        System.out.println("---- Associated Houses ----");
        for (House house : houses) {
            house.display();
        }
    }
}
