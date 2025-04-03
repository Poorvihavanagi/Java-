package com.xworkz.isaRelation;

import com.xworkz.inheritance.Coin;
import com.xworkz.inheritance.Currency;

public class CurrencyRunner {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.printValue();
        coin.checkAuthenticity();
        coin.exchange();
        coin.useForPayment();
        coin.collect();
        System.out.println("-------------------------------------------");

        Currency currency = new Coin();
        currency.printValue();
        currency.checkAuthenticity();
        currency.exchange();
        currency.useForPayment();
        currency.collect();
    }
}
