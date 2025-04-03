package com.xworkz.inheritance;

public class College extends University
{
    public void offerPrograms() {
        super.offerPrograms();
        System.out.println("Offering specialized programs...");
    }

    public void provideResearchOpportunities() {
        super.provideResearchOpportunities();
        System.out.println("Focusing on field-specific research...");
    }

    public void hostEvents() {
        super.hostEvents();
        System.out.println("Organizing academic and cultural events...");
    }

    public void offerDegrees() {
        super.offerDegrees();
        System.out.println("Offering undergraduate degrees...");
    }

    public void provideInfrastructure() {
        super.provideInfrastructure();
        System.out.println("Providing college-specific facilities...");
    }
}
