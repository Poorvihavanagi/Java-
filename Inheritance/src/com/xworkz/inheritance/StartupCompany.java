package com.xworkz.inheritance;

public class StartupCompany extends Company{
    public void hireDevelopers(){
        System.out.println("Running hire developers in IT company");
    }
    public void pitchIdea(Company company){
        company.conductMeeting();
        company.developProduct();
        company.generateRevenue();
        company.hireEmployee();
        company.provideService();

        if(company instanceof StartupCompany){
            System.out.println("Company is an instance of startup company");
            StartupCompany startupCompany=(StartupCompany) company;
            startupCompany.hireDevelopers();
        }
    }
}
