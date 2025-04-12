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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof SewingKit) {
                System.out.println("Ref is SewingKit, will compare...");
                SewingKit kit1 = this;
                SewingKit kit2 = (SewingKit) obj;
                if (kit1.numberOfItems == kit2.numberOfItems && kit1.caseType.equals(kit2.caseType) && kit1.usage.equals(kit2.usage)) {
                    System.out.println("Both sewing kits are identical");
                    return true;
                }
            }
        }
        return false;
    }
}