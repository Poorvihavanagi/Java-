package com.xworkz.isaRelation;

import com.xworkz.inheritance.Company;
import com.xworkz.inheritance.ITCompany;
import com.xworkz.inheritance.StartupCompany;

public class CompanyRunner
{
    public static void main(String[] args) {
        ITCompany itCompany = new ITCompany();
        itCompany.hireEmployee();
        itCompany.conductMeeting();
        itCompany.developProduct();
        itCompany.provideService();
        itCompany.generateRevenue();

        System.out.println("------------------------------------------------");

        Company company = new ITCompany();
        company.hireEmployee();
        company.conductMeeting();
        company.developProduct();
        company.provideService();
        company.generateRevenue();

        System.out.println("------------------------------------------------");

        StartupCompany startupCompany=new StartupCompany();
        startupCompany.pitchIdea(startupCompany);
    }
}
