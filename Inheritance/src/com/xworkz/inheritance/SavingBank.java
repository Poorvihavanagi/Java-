package com.xworkz.inheritance;

public class SavingBank extends Bank {
    @Override
    public void openAccount() {
        super.openAccount();
        System.out.println("Running open Account in Savings Bank");
    }
    @Override
    public void deposit() {
        super.deposit();
        System.out.println("Running deposit in Savings Bank");
    }
    @Override
    public void withdraw() {
        super.withdraw();
        System.out.println("Running withdraw in Savings Bank");
    }
    @Override
    public void checkBalance() {
        super.checkBalance();
        System.out.println("Running check Balance in Savings Bank");
    }
    @Override
    public void closeAccount() {
        super.closeAccount();
        System.out.println("Running close Account in Savings Bank");
    }
    public void issueCheckBook(){
        System.out.println("Running issue check book in savings bank");
    }
}
