package com.xworkz.copies;

import com.xworkz.brandNew.GameAndCoin;
import com.xworkz.internal.Coin;
import com.xworkz.internal.Chessboard;

public class GameAndCoinRunner {
    public static void main(String[] args) {
        Coin coin = new GameAndCoin();
        coin.flip();
        coin.store();
        coin.exchange();

        System.out.println("------------------------------");

        Chessboard chessboard = new GameAndCoin();
        chessboard.setUp();
        chessboard.play();
    }
}
