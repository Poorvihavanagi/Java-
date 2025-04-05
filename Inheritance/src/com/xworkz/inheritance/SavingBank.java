package com.xworkz.inheritance;

public class SavingBank extends Bank {
    @Override
    public void openAccount() {
        super.openAccount();
        System.out.println("Running openAccount in SavingBank");
    }
    @Override
    public void deposit() {
        super.deposit();
        System.out.println("Running deposit in SavingBank");
    }
    @Override
    public void withdraw() {
        super.withdraw();
        System.out.println("Running withdraw in SavingBank");
    }
    @Override
    public void checkBalance() {
        super.checkBalance();
        System.out.println("Running checkBalance in SavingBank");
    }
    @Override
    public void closeAccount() {
        super.closeAccount();
        System.out.println("Running closeAccount in SavingBank");
    }
}
