package com.xworkz.runner;

import com.xworkz.internal.Coin;
import com.xworkz.implement.CurrencyCoin;

public class CoinRunner {
    public static void main(String[] args) {
        Coin coin = new CurrencyCoin();
        coin.flip();
        coin.store();
        coin.exchange();
    }
}
