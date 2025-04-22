package com.xworkz.practice.internal;

public class IncomeTaxDeptImpl implements TaxDepartment{
    @Override
    public void fileReturns() {
        System.out.println("Running file returns in income tax dept");
    }
}
