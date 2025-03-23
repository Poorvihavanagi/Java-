package com.xworkz.country;

public class Minister
{
    String name;
    String department;

    PersonalAssistant[] personalAssistants = {
            new PersonalAssistant("Arun Kumar", 45, "PA101", "New Delhi"),
            new PersonalAssistant("Ramesh Iyer", 38, "PA102", "Mumbai, Maharashtra"),
            new PersonalAssistant("Priya Sharma", 42, "PA103", "Bangalore, Karnataka"),
            new PersonalAssistant("Sanjay Verma", 36, "PA104", "Chennai, Tamil Nadu"),
            new PersonalAssistant("Meera Nair", 40, "PA105", "Kolkata, West Bengal")
    };

    Portfolio[] portfolios = {
            new Portfolio("Ministry of Finance", 10000000000L, 5, "Nirmala Sitharaman"),
            new Portfolio("Ministry of Defense", 5000000000L, 4, "Rajnath Singh"),
            new Portfolio("Ministry of Health", 25000000000L, 3, "Mansukh Mandaviya"),
            new Portfolio("Ministry of Education", 30000000000L, 4, "Dharmendra Pradhan"),
            new Portfolio("Ministry of Infrastructure", 4000000000L, 5, "Nitin Gadkari")
    };

    Minister(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("\nMinister Name: " + name);
        System.out.println("Department: " + department);

        System.out.println("---- Personal Assistants ----");
        for (PersonalAssistant assistant : personalAssistants) {
            assistant.display();
        }

        System.out.println("---- Portfolios ----");
        for (Portfolio portfolio : portfolios) {
            portfolio.display();
        }
    }
}
