package com.xworkz.toString.internal;

public class Airpurifier {
    private String brand;
    private String filterType;
    private int areaCoverage;

    public Airpurifier(String brand, String filterType, int areaCoverage) {
        this.brand = brand;
        this.filterType = filterType;
        this.areaCoverage = areaCoverage;
    }
    @Override
    public String toString() {
        return "AirPurifier{Brand='" + brand + "', Filter Type='" + filterType + "', Area Coverage=" + areaCoverage + "sqft}";
    }
    @Override
    public int hashCode(){
        System.out.println("Default hashcode: " +super.hashCode());
        return 60;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            System.out.println("Ref is not null");
            if(obj instanceof Airpurifier){
                System.out.println("Ref is Air purifier, will compare....");
                Airpurifier airpurifier1=this;
                Airpurifier airpurifier2=(Airpurifier) obj;
                if(airpurifier1.brand.equals(airpurifier2.brand)) {
                    System.out.println("Both Air purifier's are same brand ");
                    return true;
                }
            }
        }
        return false;
    }
}
