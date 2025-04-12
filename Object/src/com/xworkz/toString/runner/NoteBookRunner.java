package com.xworkz.toString.runner;

import com.xworkz.toString.internal.NoteBook;

public class NoteBookRunner {
    public static void main(String[] args) {
        NoteBook notebook = new NoteBook("Classmate", 180, "Ruled");
        System.out.println(notebook);

        int hash = notebook.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(notebook));

        NoteBook notebook1 = new NoteBook("Classmate", 180, "Ruled");
        NoteBook notebook2 = new NoteBook("Camlin", 200, "Plain");

        System.out.println("Checking same location: " + (notebook1 == notebook2));
        boolean same = notebook1.equals(notebook2);
        System.out.println("Notebook1 is same as Notebook2: " + same);
    }
}
