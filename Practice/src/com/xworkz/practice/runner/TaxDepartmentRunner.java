package com.xworkz.practice.runner;

import com.xworkz.practice.external.Company;
import com.xworkz.practice.internal.IncomeTaxDeptImpl;
import com.xworkz.practice.internal.TaxDepartment;

public class TaxDepartmentRunner {
    public static void main(String[] args) {
        TaxDepartment taxDepartment=new IncomeTaxDeptImpl();
        Company company=new Company(taxDepartment);
        company.auditAccounts();
    }
}
