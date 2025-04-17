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
    @Override
    public void clean() {
        System.out.println("Cleaning the wooden chessboard with a cloth.");
    }

    @Override
    public void fold() {
        System.out.println("Folding the wooden chessboard for easy storage.");
    }
}
