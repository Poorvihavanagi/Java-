package com.xworkz.practice.external;

import com.xworkz.practice.internal.TaxDepartment;

public class Company {
    private TaxDepartment taxDepartment;

    public Company(TaxDepartment taxDepartment){
        this.taxDepartment=taxDepartment;
        System.out.println("Parameterized const");
    }
    public void auditAccounts(){
        if(this.taxDepartment!=null){
            this.taxDepartment.fileReturns();
            System.out.println("Tax dept is not null");
        }
        else{
            System.out.println("It is null");
        }
    }
}
