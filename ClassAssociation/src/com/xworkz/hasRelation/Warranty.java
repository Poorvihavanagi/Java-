package com.xworkz.hasRelation;

public class Warranty
{
    private String startDate;
    private String endDate;

    public Warranty(String startDate, String endDate){
        System.out.println("Running const");
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public void warrantyDisplay(){
        System.out.println("Start date: " +this.startDate);
        System.out.println("End date: " +this.endDate);
    }
}
