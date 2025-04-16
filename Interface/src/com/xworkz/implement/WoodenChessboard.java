package com.xworkz.implement;

import com.xworkz.internal.Chessboard;

public class WoodenChessboard implements Chessboard {
    public void setUp() {
        System.out.println("Setting up the wooden chessboard with pieces.");
    }

    public void play() {
        System.out.println("Playing chess on the wooden chessboard.");
    }

    public void store() {
        System.out.println("Storing the wooden chessboard after use.");
    }
}
