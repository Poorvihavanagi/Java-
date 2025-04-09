package com.xworkz.toString.runner;
import com.xworkz.toString.internal.Whiteboard;

public class WhiteboardRunner {
    public static void main(String[] args) {
        Whiteboard board = new Whiteboard("3x2 ft", "Aluminum", true);
        System.out.println(board);
    }
}