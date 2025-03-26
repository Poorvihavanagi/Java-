package com.xworkz.encapsulation;

public class Bank
{
    public static String bankName;

    public void createAccount(BankAccount bankAccount){
        System.out.println("running create account in bank");
        bankAccount.setAccNumber(9876543212L);
        bankAccount.setBalance(5000.00);
    }

    static{
        bankName = "Punjab National Bank";
        System.out.println("Bank name: " +bankName);
        System.out.println("Running static block in bank by JVM");
    }
}
