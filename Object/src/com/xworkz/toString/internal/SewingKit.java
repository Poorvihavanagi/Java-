package com.xworkz.toString.internal;

public class SewingKit {
    private int numberOfItems;
    private String caseType;
    private String usage;

    public SewingKit(int numberOfItems, String caseType, String usage) {
        this.numberOfItems = numberOfItems;
        this.caseType = caseType;
        this.usage = usage;
    }
    @Override
    public String toString() {
        return "SewingKit{Items=" + numberOfItems + ", CaseType='" + caseType + "', Usage='" + usage + "'}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hash code: " + super.hashCode());
        return 39;
    }
}