package com.xworkz.runner;

import com.xworkz.internal.Chessboard;
import com.xworkz.implement.WoodenChessboard;

public class ChessboardRunner {
    public static void main(String[] args) {
        Chessboard chessboard = new WoodenChessboard();
        chessboard.setUp();
        chessboard.play();
        chessboard.store();
    }
}
