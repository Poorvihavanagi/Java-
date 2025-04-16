package com.xworkz.implement;

import com.xworkz.internal.Coin;

public class CurrencyCoin implements Coin {
    public void flip() {
        System.out.println("Flipping the coin.");
    }

    public void store() {
        System.out.println("Storing the coin in the wallet.");
    }

    public void exchange() {
        System.out.println("Exchanging the coin for goods or services.");
    }
}
