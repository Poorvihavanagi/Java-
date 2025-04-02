package com.xworkz.isaRelation;

import com.xworkz.inheritance.Case;
import com.xworkz.inheritance.Wallet;

public class WalletRunner
{
    public static void main(String[] args) {

        Case walletCase = new Case();
        walletCase.open();
        walletCase.close();
        walletCase.storeMoney();
        walletCase.checkCapacity();
        walletCase.carry();

        System.out.println("------------------------------");

        Wallet wallet = new Case();
        wallet.open();
        wallet.close();
        wallet.storeMoney();
        wallet.checkCapacity();
        wallet.carry();
    }
}
