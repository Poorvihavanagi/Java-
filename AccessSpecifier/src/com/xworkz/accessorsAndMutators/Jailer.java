package com.xworkz.accessorsAndMutators;

public class Jailer
{
    public void jailService(Jail jail){
        System.out.println("Jail information....");
        System.out.println("Name: " +jail.getName());
        System.out.println("Location: " +jail.getLocation());
        System.out.println("Jailer Name: " +jail.getJailerName());
        System.out.println("Total cells in jail: " +jail.getTotalCells());
    }

    public void initJailService(){
        Jail jail = new Jail();
        jail.setName("Central Jail");
        jail.setLocation("Banglore");
        jail.setJailerName("Rajesh");
        jail.setTotalCells(250);

        jailService(jail);
    }
}
