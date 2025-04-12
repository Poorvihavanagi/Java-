package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Whiteboard;

public class WhiteboardRunner {
    public static void main(String[] args) {
        Whiteboard board = new Whiteboard("3x2 ft", "Aluminum", true);
        System.out.println(board);

        int hash = board.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(board));

        Whiteboard board1 = new Whiteboard("4x3 ft", "Wood", true);
        Whiteboard board2 = new Whiteboard("4x3 ft", "Wood", true);

        System.out.println("Checking same location: " + (board1 == board2));
        boolean same = board1.equals(board2);
        System.out.println("Board1 is same as Board2: " + same);
    }
}