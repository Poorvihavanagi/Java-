package com.xworkz.country;

public class PrimeMinister
{
    String name;
    int age;
    String party;
    int yearsInOffice;

    Minister minister1 = new Minister("Amit Shah", "Home Affairs");
    Minister minister2 = new Minister("Nirmala Sitharaman", "Finance & Corporate Affairs");
    Minister minister3 = new Minister("Rajnath Singh", "Defence");
    Minister minister4 = new Minister("S.Jaishankar", "External Affairs");
    Minister minister5 = new Minister("Dharmendra Pradhan", "Education");
    Minister[] ministers = {minister1, minister2, minister3, minister4, minister5};

    PrimeMinister(String name, int age, String party, int yearsInOffice) {
        this.name = name;
        this.age = age;
        this.party = party;
        this.yearsInOffice = yearsInOffice;
    }

    void display() {
        System.out.println("The Primeminister name: " + name);
        System.out.println("The Primeminister age: " + age);
        System.out.println("The Primeminister party: " + party);
        System.out.println("The Primeminister years in office: " + yearsInOffice);

        System.out.println("\n---- Minister Details ----");
        for (Minister minister : ministers) {
            minister.display();
        }
    }
}
