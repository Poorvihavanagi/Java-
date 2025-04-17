package com.xworkz.brandNew;

import com.xworkz.internal.Bank;
import com.xworkz.internal.Building;

public class SecureBankTower implements Bank, Building {

    @Override
    public void deposit() {
        System.out.println("Depositing money into SecureBankTower account.");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing money from SecureBankTower account.");
    }

    @Override
    public void checkBalance() {
        System.out.println("Checking balance in SecureBankTower account.");
    }

    @Override
    public void construct() {
        System.out.println("Constructing the SecureBankTower building.");
    }

    @Override
    public void demolish() {
        System.out.println("Demolishing the SecureBankTower building.");
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining the SecureBankTower building.");
    }
}
