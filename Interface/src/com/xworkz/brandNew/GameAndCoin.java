package com.xworkz.brandNew;

import com.xworkz.internal.Coin;
import com.xworkz.internal.Chessboard;

public class GameAndCoin implements Coin, Chessboard {

    @Override
    public void flip() {
        System.out.println("Flipping the coin.");
    }

    @Override
    public void store() {
        System.out.println("Storing the coin.");
    }

    @Override
    public void exchange() {
        System.out.println("Exchanging the coin.");
    }

    @Override
    public void clean() {
        System.out.println("Running clean");
    }

    @Override
    public void inspect() {
        System.out.println("Running inspect");
    }

    @Override
    public void fold() {
        System.out.println("Running fold");
    }

    @Override
    public void setUp() {
        System.out.println("Setting up the chessboard.");
    }

    @Override
    public void play() {
        System.out.println("Playing the chess game.");
    }

}
