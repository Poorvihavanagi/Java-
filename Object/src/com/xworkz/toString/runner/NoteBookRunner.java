package com.xworkz.toString.runner;

import com.xworkz.toString.internal.NoteBook;

public class NoteBookRunner {
    public static void main(String[] args) {
        NoteBook notebook = new NoteBook("Classmate", 180, "Ruled");
        System.out.println(notebook);
    }
}
