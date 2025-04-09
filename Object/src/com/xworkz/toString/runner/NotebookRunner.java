package com.xworkz.toString.runner;
import com.xworkz.toString.internal.NoteBook;

public class NotebookRunner {
    public static void main(String[] args) {
        NoteBook notebook = new NoteBook("Classmate", 200, "Ruled");
        System.out.println(notebook);
    }
}
