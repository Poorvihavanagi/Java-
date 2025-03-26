package com.xworkz.encapsulation;

public class BankAccount
{
    private long accNumber;
    private double balance;

    public long getAccNumber(){
        return this.accNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAccNumber(long accNumber){
        this.accNumber=accNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

}
