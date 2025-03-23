package com.xworkz.country;

public class PersonalAssistant
{
    String name;
    int age;
    String empId;
    String address;

    House[] houses = {
            new House("Delhi Residence"),
            new House("Mumbai Quarters"),
            new House("Chennai Bungalow"),
            new House("Bangalore Apartment"),
            new House("Kolkata Office")
    };

    Security security = new Security("Z+ Security");

    PersonalAssistant(String name, int age, String empId, String address) {
        this.name = name;
        this.age = age;
        this.empId = empId;
        this.address = address;
    }

    void display() {
        System.out.println("Assistant Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);

        System.out.println("---- House Details ----");
        for (House house : houses) {
            house.display();
        }

        System.out.println("---- Security Details ----");
        security.display();
    }
}
