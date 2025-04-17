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

    @Override
    public void clean() {
        System.out.println("Cleaning the currency coin to remove dirt and grime.");
    }

    @Override
    public void inspect() {
        System.out.println("Inspecting the currency coin for any damage or defects.");
    }
}
