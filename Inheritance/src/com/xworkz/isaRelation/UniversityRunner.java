package com.xworkz.isaRelation;

import com.xworkz.inheritance.College;
import com.xworkz.inheritance.University;

public class UniversityRunner
{
    public static void main(String[] args) {
        College college = new College();
        college.offerPrograms();
        college.provideResearchOpportunities();
        college.hostEvents();
        college.offerDegrees();
        college.provideInfrastructure();

        System.out.println("--------------------------------------------------------------------------");

        University university = new College();
        university.offerPrograms();
        university.provideResearchOpportunities();
        university.hostEvents();
        university.offerDegrees();
        university.provideInfrastructure();
    }
}
