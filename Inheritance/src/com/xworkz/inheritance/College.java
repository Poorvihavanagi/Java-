package com.xworkz.inheritance;

public class College extends University {

    @Override
    public void offerPrograms() {
        super.offerPrograms();
        System.out.println("Running offer Programs in College");
    }

    @Override
    public void provideResearchOpportunities() {
        super.provideResearchOpportunities();
        System.out.println("Running provide Research Opportunities in College");
    }

    @Override
    public void hostEvents() {
        super.hostEvents();
        System.out.println("Running host Events in College");
    }

    @Override
    public void offerDegrees() {
        super.offerDegrees();
        System.out.println("Running offer Degrees in College");
    }

    @Override
    public void provideInfrastructure() {
        super.provideInfrastructure();
        System.out.println("Running provide Infrastructure in College");
    }
}
